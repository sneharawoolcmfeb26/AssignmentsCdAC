#include <iostream>
using namespace std;

void findMinMax(int a, int b, int c, int &minVal, int &maxVal)\
{
    minVal = a;
    maxVal = a;

    if(b<minVal)
    minVal = b;
    if(b>maxVal)
    maxVal = b;

    if(c<minVal)
    minVal = c;
    if(c>maxVal)
    maxVal = c;
}

int main(){

    int lo, hi;

    findMinMax(4, 9, 2, lo, hi);

    cout << "Minimum: " << lo << endl;
    cout << "Maximum: " << hi << endl;

    return 0;

}