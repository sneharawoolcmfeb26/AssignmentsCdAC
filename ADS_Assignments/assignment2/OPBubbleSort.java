package com.assignment2;

public class OPBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,4,5,6};
		int n = arr.length;
		
		boolean swap = false;
		
		for(int i = 0; i< n - 1; i++) {
			for(int j = 0; j < n - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[i];
					arr[i] = arr[j + 1];
					arr[j + 1] = temp;
					
					swap = true;  //swap happend
				}
			}
			if(!swap) {
				System.out.println("Array already Sorted");
				break;
			}
		}
	}

}
