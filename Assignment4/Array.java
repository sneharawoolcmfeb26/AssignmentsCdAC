//Question 6: Print All Elements of an Array

import java.util.Scanner;

class Array{
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		System.out.print("Enter the 5 numbers: ");
		
		
		for(int i=0;i<arr.length;i++){
			System.out.print("Integer "+(i+1)+":");    
			arr[i] = scanner.nextInt();
		}
		System.out.println("\nThe elements of the array are:");
        for (int num : arr) {
            System.out.println(num);
        }
		
		
	}
}