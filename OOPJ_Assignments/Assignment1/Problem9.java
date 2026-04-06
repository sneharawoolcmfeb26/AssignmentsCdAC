package Assignment1;

public class Problem9 {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        char op = '+';

        switch (op) {
            case '+':
                System.out.println("Addition: " + (a + b));
                break;
            
            case '-':
                System.out.println("Subtract: " + (a - b));
                break;

            case '*':
                System.out.println("Multiply: " + (a * b));
                break;

            case '/':
                System.out.println("Divide: " + (a / b));
                break;
        
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
    
}
