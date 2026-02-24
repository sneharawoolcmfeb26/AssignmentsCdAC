//============================================================================
// Name        : Day2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================


//Variables

#include <iostream>

int num = 100;   //Global variable

int main() {

	printf("num: %d \n", num);

	int num = 10;  //local variable

	printf("num: %d \n", num);
	{

		printf("num: %d \n", num);

		int num = 20;     //Block Scope local variable

		printf("num: %d \n", num);

	}  //scope ends here

	printf("num: %d \n", num);

	return 0;
}
