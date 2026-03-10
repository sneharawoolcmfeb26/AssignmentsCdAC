//Question 10: Find the Average of Elements in an Array

import java.util.Scanner;

class AvgArr{
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = new int[5];  //creation 
		int sum = 0;
		
		System.out.print("Enter the 5 numbers: ");
		
		for(int i=0;i<arr.length;i++){
			
			arr[i] = scanner.nextInt();
			sum+=arr[i];
		}
		double average = (double) sum / arr.length;
		
		System.out.println("Average is " + average);
		
		
	}
}
