//Question 11: Count Positive and Negative Numbers in an Array

import java.util.Scanner;

class PosNegArr{
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = new int[6];  //creation 
		int positive =0;
		int negative =0;
		
		System.out.print("Enter the 5 numbers: ");
		
		for(int i=0;i<arr.length;i++){
			
			arr[i] = scanner.nextInt();
		}
		for(int num : arr){
			if(num>0){
				positive++;
			}else if(num<0){
				negative++;
			}
		}
		
		System.out.println("Positive numbers: "+positive);
		System.out.println("Negative numbers: "+negative);
		
	}
}
