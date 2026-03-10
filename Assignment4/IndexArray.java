//Question 14: Find the Index of an Element in an Array


import java.util.Scanner;
import java.util.Arrays;

class IndexArr{
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = new int[5];  //creation 
		
		System.out.print("Enter the 5 numbers: ");
		
		for(int i=0;i<arr.length;i++){
			
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.print("Enter the  number to search: ");
		int target = scanner.nextInt();
		
		int index = Arrays.binarySearch(arr, target);
		
		if(index>=0){
			System.out.println("Number found at index: "+index);
		}
		else{
			System.out.println("Not Found");
		}
	}
}