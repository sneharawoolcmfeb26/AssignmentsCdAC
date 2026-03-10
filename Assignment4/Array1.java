//Question 7: Find the Sum of All Elements in an Array

import java.util.Scanner;

class Array1{
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = new int[5];  //creation 
		
		System.out.print("Enter the 5 numbers: ");
		
		for(int i=0;i<arr.length;i++){
			//System.out.print("Integer "+(i+1)+":");    
			arr[i] = scanner.nextInt();
		}
		
		int sum=0;
        for (int num : arr) {
            sum += num;  //add each element
        }
		System.out.println("\nThe sum of array is: " +sum);
		
	}
}