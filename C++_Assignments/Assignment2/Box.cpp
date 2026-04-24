#include <iostream> 
using namespace std;

class Box{
    private:
    int length;
    int width;
    int height;

    public:
    Box(int length,int width, int height){
        this->length = length;
        this->width = width;
        this->height = height;
    }

    void setDimensions(int length, int width, int height){
        this->length = length;
        this->width= width;
        this->height = height;
    }

    int volume(){
        return length * width * height;
    }

    void display(){
        cout << "Length: " << length <<endl;
        cout << "Width: " << width <<endl;
        cout << "Height: " << height <<endl;
        cout << "Volume: " << volume() <<endl;
        
    }
};

int main(){
    Box b1(10,5,2);

    cout << "Constructor initialization:\n";
    b1.display();

    cout << "After Updating:\n";
    b1.setDimensions(4,3,2);
    b1.display();

    return 0;
}

/*
Q1. Why must initialization happen before assignment?
    Initialization must happen before assignment because data members 
    of a class are created and initialized before the constructor body executes.

When an object is created:

Step 1 → Data members are initialized first
Step 2 → Constructor body runs
Step 3 → Assignment happens (if written)

So actually:
Initialization always happens before assignment internally.

class Test {
    int x;  
public:
    Test(int a) {
        x = a;   // Assignment
    }
};

Here what really happens:
    x is first initialized (default/garbage)
    Then x = a assigns value
So two operations happen:
    *Initialization
    *Assignment


Q2. When is initialization preferred over assignment?

Initialization is preferred:
 *When data members are const
 class Test {
    const int x;
public:
    Test(int a) : x(a) {}   // Must initialize
}; 
    Because const must be initialized at creation time.


 *When data members are reference variables
 class Test {
    int &ref;
public:
    Test(int &r) : ref(r) {}   // Must initialize
};
    Reference cannot be reassigned.

    
 *When better performance is required
 *When using constructor initializer list (recommended C++ practice)
 *Const and reference members must be initialized, they cannot be assigned later.

*/