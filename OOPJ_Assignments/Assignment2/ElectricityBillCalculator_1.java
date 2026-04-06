/*Electricity Bill Calculator 
Create a Java program to calculate a household electricity bill. 
Requirements 
● Accept customer name, consumer number, and units consumed. 
● Calculate bill using slab rates such as: 
○ First 100 units → Rs. 5 per unit 
○ Next 100 units → Rs. 7 per unit 
○ Above 200 units → Rs. 10 per unit 
● If the bill exceeds Rs. 1500, apply a 5% surcharge. 
● Display complete bill details.*/

import java.util.Scanner;

class ElectricityBillCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Consumer Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Consumer Number: ");
        int connum = sc.nextInt();

        System.out.println("Enter Units Consumed: ");
        double units = sc.nextDouble();

        double bill = 0;

        if(units <= 100){
            bill = units * 5;
        }
        else if(units <= 200){
            bill = 100 * 5 + (units - 100) * 7;
        }
        else{
            bill = 100 * 5 + 100 * 7 + (units - 200) * 10;
        }
        //surcharge
        if(bill > 1500){
            bill = bill + (bill * 0.05);
        }

        //Output
        System.out.println("Name: "+name);
        System.out.println("Consumer Number: "+connum);
        System.out.println("Units Consumed: "+units);
        System.out.println("Bill: "+bill);

    }
}
