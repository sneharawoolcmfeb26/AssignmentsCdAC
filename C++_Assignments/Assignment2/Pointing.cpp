#include <iostream>
using namespace std;

int main(){
    int x = 10;

    int *p =&x;

    int &ref = x;

    *p = 20;
    cout <<"After modifying using pointer: "<< x <<endl;

    ref = 30;
    cout <<"After modifying using reference: "<< x <<endl;

    return 0;

}

/*
Q3.2 — Explain: 
  Two differences between pointer and reference 
    Pointer                          Reference
   *Stores address of variable       *Alias (another name) of variable
   *Uses * and &                     *Uses & only during declaration
   *Can point to another             *Cannot change once initialized
    variable later

Why References Cannot Be Reseated but Pointers Can?
    A reference is an alias of an existing variable.

    Once it is bound to a variable:

    int &ref = a;

    It becomes permanently attached to a.
    You cannot make it refer to another variable.

    Pointer stores an address, and addresses can be changed:
    ptr = &b;   // Just changing stored address
    So:
    Pointer → stores address → can change
    Reference → alias → cannot change

Why References Cannot Be NULL?
    A reference must refer to a valid existing variable at the time of declaration.
    int &ref;   // ❌ Error

    Because:
    Reference must be initialized immediately
    It must always refer to valid memory
    It cannot exist without a target


    But pointer can be NULL:
    int *ptr = NULL;   // Allowed
    Because pointer is just a variable storing address.
    */