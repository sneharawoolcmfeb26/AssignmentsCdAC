//Question 13: Check if an Array Contains a Specific Element

import java.util.Scanner;
import java.util.Arrays;

class SpecificArr{
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		Integer arr[] = new Integer[5];  //creation 
		
		System.out.print("Enter the 5 numbers: ");
		
		for(int i=0;i<arr.length;i++){
			
			arr[i] = scanner.nextInt();
		}
		System.out.print("Enter the  number: ");
		int number = scanner.nextInt();
		
		if(Arrays.asList(arr).contains(number)){    //import array for thiss
			System.out.println("Found ");
		}
		else{
			System.out.println("Not Found");
		}
	
	}
}