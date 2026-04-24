package com.assignment2;

public class SelectionSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {64, 8, 12, 6, 11};
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i++) {
			int minIndex = i;   //assume current index has min element
			
			//find smallest element
			for(int j = i + 1; j < n; j++) {
				if(arr[j] > arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		System.out.println("Sorted array: ");
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
