#include <iostream>
using namespace std;

class Student{
    protected:
        int rollNo;

public:
    Student(int rn){
    rollNo = rn;
    }

    virtual void display(){
        cout << "Roll No: "<<rollNo<<endl;
    }
};

class Result : public Student{
    float marks;

public:
    Result(int rn,float mrk) :Student(rn){
        marks = mrk;
    }

    void display(){
        cout << "Roll No: "<<rollNo<<endl;
        cout << "Marks: "<<marks<<endl;
    }
};

int main(){
    Result r1(10,20);

    Student *ptr;
    ptr = &r1;

    ptr->display();

    return 0;
}

/*
Which constructor will be called first: Student or Result?
    The base class constructor is always called first.

    Constructor Call Order
    1.Student constructor
    2.Result constructor

    Reason:
    The derived class object contains the base class part, so the base class must be initialized first.

    Flow
    Result r1(10,20)
        ↓
    Student(10)  → initializes rollNo
        ↓
    Result(10,20) → initializes marks


Does the program demonstrate early binding or late binding?
    The program demonstrates Late Binding (Runtime Polymorphism).
    Because:

    Student *ptr;
    ptr = &r1;
    ptr->display();

    Here:
    Pointer type → Student
    Object type → Result

    Since display() is virtual, the function call is decided at runtime.


Why is the display() function declared as virtual
    virtual is used to enable runtime polymorphism.
    It tells the compiler:
    "Call the function based on the object type, not the pointer type."
*/