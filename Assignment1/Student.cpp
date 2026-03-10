#include <iostream> 
using namespace std;

class Student {
    string name;
    int rollNumber;
    float marks;
    char grade;

public:
    void setname(string s){
        name = s;
    }
    void setrollNumber(int r){
        rollNumber = r;
    }
    void setmarks(float m){
        marks = m;
        //4calculateGrade();
    }
    void setgrade(char g){
        grade = g;
    }

    string getname()
    {
        return name;
    }
    int getrollNumber()
    {
        return rollNumber;
    }
    float getmarks()
    {
        return marks;
    }
    char getgrade()
    {
        return grade;
    }

    void calculateGrade(){
        if(marks >=90 && marks <=100)
            grade = 'A';
        else if(marks >=80)
            grade = 'B';
        else if(marks >=70)
            grade = 'C';
        else if(marks >=60)
            grade = 'D';
        else
            grade = 'F';

        cout << "Grade calculated successfully!\n";
    }

    void display(){
        cout << "\nName: "<< name << endl;
        cout << "Roll Number: " << rollNumber << endl;
        cout << "Marks: "<<marks << endl;
        cout << "Grade: "<< grade << endl;
    }
};

int main(){
    Student s;
    int choice;      // we write all becoz 
    string name;     //we need variables
    int rollno;        //to store data
    float marks;

    do {
        cout << "\n1.Accept Information";
        cout << "\n2.Display Information";
        cout << "\n3.Calculate Grade";
        cout << "\n4.Exit";
        cout << "\n5.Enter Choice:";
        cin >> choice;

        switch (choice)
        {
        case 1:
            cout << "Enter Name: ";
            cin >> name;
            s.setname(name);

            cout << "Enter Roll No.: ";
            cin >> rollno;
            s.setrollNumber(rollno);

            cout << "Enter Marks: ";
            cin >> marks;
            s.setmarks(marks);
            break;

        case 2:
            s.display();
            break;
        
        case 3:
            s.calculateGrade();
            cout << "Grade Calculated:\n";
            break;

        case 4:
            cout << "Program Ended\n";
            break;

        default:
            cout << "Invalid Choice\n";
            break;
        }
        
    }while(choice !=4);

    return 0;
}
