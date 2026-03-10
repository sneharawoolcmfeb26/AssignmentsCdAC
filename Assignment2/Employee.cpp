#include <iostream>
using namespace std;

class Employee{
    const int employeeId;
    string name;
    float salary;
    
    public:
    Employee(int empid, string nm, float sal):
    employeeId(empid),name(nm),salary(sal){
    }

    void display() const{
        cout << "Employee ID: "<< employeeId<<endl;
        cout << "Name: "<< name<<endl;
        cout << "Salary: "<< salary<<endl;
    }
};

int main(){
    Employee e1(101,"Sneha",300000);
    Employee e2(102,"Akshata",399049);

    e1.display();
    e2.display();
    return 0;
}

/*
Why must const members be initialized in initializer list? 
    const members must be initialized using initializer list because they 
    cannot be assigned a value after object creation.

What happens if you assign a const member inside constructor body?
    Example:
    class Employee {
        const int id;
    public:
        Employee(int x) {
            id = x;   // ❌ trying to assign
        }
    };
    ❌ Result: Compilation Error

    Typical error:
    error: assignment of read-only member ‘Employee::id’

    Why?
    When object creation starts:
        Memory is allocated.
        Data members are initialized.
        Then constructor body runs.
        Since id is const, it must be initialized in step 2.

    If you don’t use initializer list:
        Compiler tries to default-initialize id
        Then inside constructor body you try to assign it
        But const variables cannot be reassigned

Why is initializer list faster than assignment?
    Because it directly initializes members instead of 
    default-initializing and then assigning them.

Initializer list avoids:
Extra temporary object
Extra assignment
Extra constructor call

This is especially important for:
Objects
Large data types
Performance-critical systems

*/