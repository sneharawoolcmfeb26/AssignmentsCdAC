package com.assignment1;

public class ArrayRecursion {
	public static boolean isSorted(int[] arr, int index) {
		if(index == arr.length - 1) {
			return true;
		}
		if(arr[index] > arr[index + 1]) {
			return false;
		}
		return isSorted(arr, index + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,1,5,8,3};
		
		boolean result = isSorted(arr, 0);
		
		System.out.println("Array is Sorted "+ result);
	}

}
