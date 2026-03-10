//Problem 4: User Input for Positive Numbers (Using do-while Loop

import java.util.Scanner;

class MethodPositive {

    public static void askForPositiveNumber() {   //creating method
		Scanner scanner = new Scanner(System.in);
        int number;
		
		do{
			System.out.print("Enter positive number: ");
			number = scanner.nextInt();
		}
		while(number <= 0);
			System.out.println("You entered: " +number);
    }
	
    public static void main(String[] args) {
		askForPositiveNumber();         //call the method
	}
}