package Assignment1;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Char: ");
        char ch = sc.next().charAt(0);

        char next = (char)(ch + 1);
        char prev = (char)(ch - 1);

        System.out.println("Next Char: " + next);
        System.out.println("Prev Char: " + prev);
        
        
    }
}
