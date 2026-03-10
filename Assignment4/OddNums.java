//Question 5: Sum of Odd Numbers between 1 and N

import java.util.Scanner;

class OddNums{
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the N number: ");
        int num = scanner.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++){
			if(i%2!=0){
				sum = sum + i;
			}
		}
		System.out.print("Sum is "+sum);  //if run inside loop it runs each time the loop runs
	}
}

