//Problem 1: Sum of Two Numbers (Using a Method)

import java.util.Scanner;

class SumMethods {

    public static int sumOfTwoNumbers(int a, int b) {
        int sum = a + b; 
        return sum;      
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int result = sumOfTwoNumbers(num1, num2);    // Call method to get sum

        System.out.println("Sum = " + result);

    }
}

