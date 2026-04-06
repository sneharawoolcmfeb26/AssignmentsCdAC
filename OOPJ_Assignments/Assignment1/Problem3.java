package Assignment1;

public class Problem3 {
    public static void main(String[] args) {
        int n1 = 10;
        double d = n1;  //implicitly

        double n2 = 40.343;
        int i = (int) n2;   //explicitly

        System.out.println("Converted " + n1 + " to double: " +d);
        System.out.println("Converted " + n2 + " to int: " +i);
    }
}
