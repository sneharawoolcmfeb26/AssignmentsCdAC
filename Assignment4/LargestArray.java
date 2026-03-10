//Question 9: Find the Largest Element in an Array

import java.util.Scanner;

class LargestArr{
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = new int[5];  //creation 
		
		System.out.print("Enter the 5 numbers: ");
		
		for(int i=0;i<arr.length;i++){
			
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr);
		
		int largest = arr[arr.length - 1];
		/*int largest =arr[0];
		for(int num : arr){
			if(num>largest){
				largest=num;
			}
		}*/
		System.out.println("Largest number is " +largest);
	}
		
}