#include <iostream>
#include <cstdlib>
using namespace std;

int main(){

    //allocate memory
    int *arr = (int*) malloc(5 * sizeof(int));

    if(arr == NULL){
        cout<<"Memory allocation failed";
        return 1;
    }

    //take input
    cout<<"Enter 5 integers:\n";
    for(int i=0;i<5;i++){
        cin >> arr[i];
    }

    //Print values
    cout <<"You entered:\n";
    for(int i=0;i<5;i++){
        cout << arr[i]<<" ";
    }

    //free
    free(arr);

    return 0;

}

/*
Q4.3 — Explain: 
  Why constructors are not called when using malloc 
    Because:
    malloc is a C function
    It only allocates raw memory
    It does NOT know anything about C++ classes

    malloc was created for C language.
    C does not have constructors or classes.
    So it has no mechanism to call constructors.

  Why new is Preferred in C++?
    new is preferred because it is a C++ operator designed for 
    object-oriented programming, while malloc is a C function.

    new is preferred in C++ because it allocates memory and 
    calls constructors automatically, does not require typecasting, 
    and works properly with objects and destructors."

Difference in Return Types and initialization
    new returns a typed pointer and does not require typecasting, 
    while malloc returns void* and requires explicit typecasting.

    new allocates memory and initializes the object by calling the constructor,
    whereas malloc only allocates raw memory and does not perform initialization.

Why malloc cannot initialize complex types

    malloc cannot initialize complex types because it only allocates raw memory 
    and does not call constructors required to properly initialize C++ objects.

    */