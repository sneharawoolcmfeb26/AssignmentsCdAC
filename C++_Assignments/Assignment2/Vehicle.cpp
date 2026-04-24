#include<iostream>
using namespace std;

class Vehicle{
    protected:
    int vechicleNo;

public:
    Vehicle(int vno){
        vechicleNo = vno;
    }

    virtual void display(){
        cout << "Vehicle number: " << vechicleNo << endl;
    }
};

class Car : public Vehicle{
    string model;

public:
    Car(int vno,string mdl):Vehicle(vno){
        vechicleNo = vno;
        model = mdl;
    }

    void display(){
        cout << "Vehicle number: " << vechicleNo << endl;
        cout << "Model: " << model << endl;
    }
};

int main(){
    Car c1(123,"Swift");

Vehicle *ptr;
ptr = &c1;

ptr->display();

return 0;
}