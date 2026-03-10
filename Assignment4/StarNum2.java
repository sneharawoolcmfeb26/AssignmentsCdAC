//Question 15:Write a program to print the following pattern

public class StarNum2 {
    public static void main(String[] args) {

        int n =6;

        for (int i = 1; i <= n; i++) {   // upper triangle
            
            for (int s = n - i; s >= 1; s--) {   //space
                System.out.print("  ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) System.out.print("*");
            }
            System.out.println();
        }

        
        for (int i = n; i >= 1; i--) {    // Lower triangle
		
            for (int s = n - i; s >= 1; s--) {   //space
                System.out.print("  ");
            }
			
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) System.out.print("*");
            }
            System.out.println();
        }
    }
}