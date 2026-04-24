#include <iostream> 
using namespace std;

void swapByValue(int a, int b){
    int temp = a;
    a = b;
    b = temp;
}

void swapByAddress(int *a, int *b){
    int temp = *a;
    *a = *b;
    *b = temp;
}
void swapByReference(int &a, int &b){
    int temp = a;
    a = b;
    b = temp;
} 

int main(){
    int x = 10, y = 20;

    cout << "Original values: x = "<< x <<",y ="<< y <<endl; 

    swapByValue(x,y);
    cout<<"After swapByValue: x = "<< x <<",y ="<< y <<endl; 

    swapByAddress(&x, &y);
    cout <<"After swapByAddress: x = "<< x <<",y ="<< y <<endl;
    
    // Reset values
    x = 10; 
    y = 20;

    swapByReference(x,y);
    cout <<"Ater swapByReference: x = "<< x <<",y ="<< y <<endl; 

    return 0;
}

/*
Explain how reference variables act as aliases and how that affects swapByReference(). 
    Reference variables act as aliases, meaning they refer to the same memory location 
    as the original variable. In swapByReference(), parameters become aliases of the 
    actual arguments, so swapping them directly swaps the original variables."

    Because reference parameters do not create copies.
They directly operate on original variables.
*/