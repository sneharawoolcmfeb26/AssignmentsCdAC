//Question 8: Print All Names in a String Array

import java.util.Scanner;

class StringArr{
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		String names[] = new String[5];  //creation 
		
		System.out.print("Enter the 5 names: ");
		
		 for (int i = 0; i < 5; i++) {
			 
			 names[i] =scanner.next();
        }
		System.out.println("Names are : ");
		for(String Name : names){
			System.out.println(Name);	
		}	
	}	
}