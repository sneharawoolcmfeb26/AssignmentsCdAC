//Question 1: Print Numbers from 1 to N

import java.util.Scanner;

class NNumbers{
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("Enter the N number: ");
        int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++){
			System.out.print(i+" ");
		}
	}
}


