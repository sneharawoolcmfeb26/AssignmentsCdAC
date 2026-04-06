package Assignment1;

public class Problem2 {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 3.5;

        double sum = num1 + num2;

        double div = num1 / num2;

        int cast = (int) div;

        System.out.println("Addition: " + sum);
        System.out.println("Division: " + div);
        System.out.println("Division after casting to int: " + cast);
    }
}

