//Question 25: Count Vowels in a String

import java.util.Scanner;

class VowelsStr{
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String str = scanner.nextLine();
		
		String reversed = "";
		
		
		for(int i= str.length() - 1;i>=0; i--){    //reverse the string 
			reversed += str.charAt(i);
		}
			
		if(str.equals(reversed)){
			System.out.println("Palindrome");
		}else{
		System.out.println("Not Palindrome");
		}
	}
}

// should be all small ar all capital