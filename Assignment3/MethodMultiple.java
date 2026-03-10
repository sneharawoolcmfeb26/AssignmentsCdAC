//Problem 5: Print Multiplication Table (Using for Loop)

import java.util.Scanner;

public class MethodMultiple {

    public static void printMultiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
	
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        printMultiplicationTable(num);      //call the method
    }
}