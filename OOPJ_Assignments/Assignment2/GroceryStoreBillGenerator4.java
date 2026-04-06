/*4. Grocery Store Bill Generator 
Create a billing system for a small grocery shop. 
Requirements 
● Accept item names, quantity, and price for multiple items. 
● Store item totals in arrays. 
● Calculate total bill amount. 
● Apply discount: 
○ 10% discount if bill is above Rs. 3000 
● Print the final bill in proper format. */

import java.util.Scanner;

public class GroceryStoreBillGenerator4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();    //clear buffer
        
        //Arrays to store item details
        String[] item = new String[n];   //store item names
        int[] qty = new int[n];          //stores qty
        double[] price = new double[n];  //stores price
        double[] total = new double[n];  //store total of each item

        double grandTotal = 0;  //total bill amount

        //Loop to take input
        for(int i = 0; i < n; i++){
            System.out.println("Enter item name: ");
            item[i] = sc.nextLine();   //store item name

            System.out.println("Enter quantity: ");
            qty[i] = sc.nextInt();

            System.out.println("Enter price: ");
            price[i] = sc.nextDouble();   //store price
           sc.nextLine();

            //Calculate total of each item
            total[i] = qty[i] * price[i];

            //Add grandTotal
            grandTotal += total[i];
        }
        //Discount
        double discount = 0;
        if(grandTotal > 3000){
            discount = grandTotal * 0.10;   //10% discount
        }

        //Final bill
        double finalbill = grandTotal - discount;

        //Print bill
        System.out.println("-----Bill-----");

        for(int i = 0; i < n; i++){
            System.out.println(item[i] + " " + qty[i] + "x" + price[i]);
        }

        System.out.println("---------------------");
        System.out.println("Total = "+ grandTotal);
        System.out.println("Discount = "+discount);
        System.out.println("Final Bill = "+finalbill);
    }
}
