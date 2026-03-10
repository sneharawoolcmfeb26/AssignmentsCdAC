//Question 24: Reverse a String

import java.util.Scanner;

class ReverseStr{
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String str = scanner.nextLine();
		
		String reversed = " ";
		
		
		for(int i= str.length() - 1;i>=0; i--){    //reverse the string 
			reversed += str.charAt(i);
		}
		
		System.out.println("Reversed String: "+reversed);
	}
}

		