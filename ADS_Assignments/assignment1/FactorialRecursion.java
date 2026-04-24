package com.assignment1;

public class FactorialRecursion {
	
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		if(n < 0) {
			System.out.println("Factorial not defined for negative numbers");
			return -1;
		}
		
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int result = factorial(n);
		System.out.println("Factorial = "+result);
	}

}
