#include <iostream>
using namespace std;

class Student{
    int rollNo;
    string name;
    float marks;

    public:
    Student(){
        rollNo = 0;
        name = "not assigned";
        marks = 0.0;
    }

    Student(int r,string n,float m){
        rollNo = r;
        name = n;
        marks = m;
    }
    Student(string name,float marks){    //should have diffn parameters
        this->rollNo = rollNo;
        this->name = name;
        this->marks = marks;
    }
    void display(){
        cout << "RollNo: "<< rollNo << endl;
        cout << "Name: "<< name << endl;
        cout << "Marks: "<< marks << endl;
    }
};

int main(){
    Student s;

    Student s1(1,"Sneha",83.0);   // it gives 83
    Student s2("Sayli",35.8);

    cout << "Student 1 Details:"<<endl;
    s.display();
    
    cout << "Student 2 Details:"<<endl;
    s1.display();
    
    cout << "Student 3 Details:"<<endl;
    s2.display();

    return 0;
}

/*
When does compiler generate a default constructor? 
    The compiler automatically generates a default constructor when:
    No constructor is defined in the class.
    The class has no user-defined constructors.

When does it NOT generate one?
    he compiler does NOT generate a default constructor when:
    At least one constructor is explicitly defined by the programmer.

    class A {
    public:
        A(int x) { }
    };

Can constructors be overloaded?
    Yes.

    Constructors can be overloaded if they have:
    Different number of parameters
    OR
    Different types of parameters
    OR
    Different order of parameters

    Example:
    Student();
    Student(int);
    Student(int, string);
    Student(int, string, float);
    
    But constructors cannot be overloaded if parameter types and order are the same.
*/