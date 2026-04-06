/*7. Mobile Recharge System 
Create a recharge application for prepaid mobile users. 
Requirements 
● Ask for mobile number and recharge amount. 
● Show recharge plans using switch-case. 
● Example: 
○ Rs. 199 → 28 days validity 
○ Rs. 399 → 56 days validity 
○ Rs. 599 → 84 days validity 
● Print recharge confirmation with plan details. */

import java.util.Scanner;

public class MobileRechargeSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Mobile number: ");
        long mobno = sc.nextLong();

        System.out.println("Recharge Amount: ");
        int ramt = sc.nextInt();

        int validity = 0; //variables to store validity days

        //Switch case
        switch(ramt){
            case 199:
                validity = 28;
                break;

            case 399:
                validity = 56;
                break;
                
            case 599:
                validity = 84;
                break;

            default:
                //If amount doesnt atch
                System.out.println("Invalid Recharge plan!");
        }

        //If plan is selected (validity > 0)
        if (validity > 0) {

            //Print confirmation
            System.out.println("\n-----Recharge Succesful-----");
            System.out.println("Mobile Number : "+mobno);
            System.out.println("Rechare Plan: Rs."+ ramt);
            System.out.println("Validity : "+validity +" days");
        }
    }
}
