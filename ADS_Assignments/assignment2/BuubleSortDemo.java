package com.assignment2;

import java.util.Arrays;

public class BuubleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {5,8,2,4,1,8,6};
		int size = nums.length;
		
		System.out.println("Before Sorting ");
		for(int num : nums) {
			System.out.print(num + " ");
		}
		
		for(int i = 0; i < size - 1; i++) {
			for(int j = 0; j < size - i - 1; j++) {
				if(nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
			
			System.out.println("\nPass " + (i + 1) + ": " + Arrays.toString(nums));
		}
		
		
		
	}

}
