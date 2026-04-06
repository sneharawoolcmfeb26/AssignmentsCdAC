package Assignment1;

public class Problem7 {
    public static void main(String[] args) {
        int a = 39;
        int b = 49;
        int c = 32;

        if(a >= b && a >= c){
            System.out.println("Largest is: "+a);
        }
        else if(b >= a && b >=c){
            System.out.println("Largest is: "+b);
        }
        else{
            System.out.println("Largest is: "+c);
        }
    }
}
