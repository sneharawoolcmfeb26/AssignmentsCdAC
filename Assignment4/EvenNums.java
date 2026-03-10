//Question 4: Print Even Numbers from 1 to N

import java.util.Scanner;

class EvenNums{
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the N number: ");
        int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}
}