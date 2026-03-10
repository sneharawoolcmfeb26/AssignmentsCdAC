#include <iostream>
using namespace std;

int main(){
    int * arr = new int[5];

    //allocates array
    cout << "Enter 5 integers: \n";
    for(int i=0;i<5;i++){
        cin >> arr[i];
    }

    //print values
    cout <<"Entered numbers: \n";
    for(int i=0;i<5;i++){
        cout << arr[i]<<" ";
    }

    //delete
    delete[]arr;
    return 0;

}