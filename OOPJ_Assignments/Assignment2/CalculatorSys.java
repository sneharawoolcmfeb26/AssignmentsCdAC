/*11. Calculator System (Overloaded Methods) 
Create a Java program for a calculator: 
Requirements: 
● Create methods named calculate 
● Overload them for: 
○ int + int 
○ double + double 
○ int + int + int 
● Call all methods from main 
● Display results clearly  */

class Calculator{
    int calculate (int a, int b){
        return a + b;
    }

    double calculate (double a, double b){
        return a + b;
    }

    int calculate (int a, int b, int c){
        return a + b + c;
    }
}
public class CalculatorSys {
    public static void main(String[] args) {
        
        Calculator cal = new Calculator();

        //Calling Overloaded methods
        int res1 =cal.calculate(10, 20);
        double res2 =cal.calculate(10.4,13.7);
        int res3 =cal.calculate(10, 20, 24);

        System.out.println("Add of 2 Integers: "+res1);
        System.out.println("Add of 2 Double: "+res2);
        System.out.println("Add of 3 Integers: "+res3);
        
    }
}
