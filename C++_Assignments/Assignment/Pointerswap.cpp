#include <iostream> 
using namespace std;

int main(){
    int x=10; 
    int y=20;
    int z=30;

    int *px = &x;
    int *py = &y;
    int *pz = &z;

    cout << "Before swap:\n";
    cout << "x = " << *px << endl;
    cout << "y = " << *py << endl;
    cout << "z = " << *pz << endl;

    cout << "\nPointer addresses:\n";
    cout << "px = " << px << endl;
    cout << "py = " << py << endl;
    cout << "pz = " << pz << endl;

    int temp = *px;    
    *px = *pz;
    *pz = temp;

    cout << "\nAfter Swap:\n";
    cout << "x = " << *px << endl;
    cout << "y = " << *py << endl;
    cout << "z = " << *pz << endl;
    
    cout << "\nPointer addresses :\n";
    cout << "px = " << px << endl;
    cout << "py = " << py << endl;
    cout << "pz = " << pz << endl;
    
    return 0;
}