package com.assignment1;

public class FibonacciRecursion {
	
	public static int fibo(int n) {
		if(n == 0) {
			return 0;
		}
		
		if(n == 1) {
			return 1;
		}
		
		if(n < 0) {
			System.out.println("Invalid input");
			return -1;
		}
		
		return fibo(n - 1) + fibo(n - 2);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = -1;
		int result = fibo(n);
		System.out.println("Fibonacci = " + result);
	}

}
