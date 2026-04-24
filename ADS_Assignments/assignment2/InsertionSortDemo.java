package com.assignment2;

public class InsertionSortDemo {
	public static void main(String args[]) {
		int arr[] = {1,3,5,7};
		int n = arr.length;
		int key = 4;   //value to insert
		
		int newarr[] = new int[n + 1];  //new array
		
		//copy elements
		for(int i = 0; i < n; i++) {
			newarr[i] = arr[i];
		}
		
		int i = n - 1;
		
		while(i >= 0 && newarr[i] > key) {  //shifts element
			newarr[i + 1] = newarr[i];
			i--;
		}
		
		newarr[i + 1] = key;  //final
	
		//print result
		for(int j = 0; j <= n; j++) {
			System.out.println(newarr[j] + " ");
		}
	}
}
