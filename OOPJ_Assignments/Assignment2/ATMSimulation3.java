/*ATM Simulation 
Create a simple ATM system. 
Requirements 
● Show a menu using switch-case: 
1. Check Balance 
2. Deposit Money 
3. Withdraw Money 
4. Exit 
● Start with an initial balance. 
● Prevent withdrawal if balance is insufficient. 
● Continue showing the menu until the user chooses Exit*/

import java.util.Scanner;

public class ATMSimulation3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bal = 100000;
        int choice;

        do{
            System.out.println("----ATM Menu----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Balance: "+bal);
                    break;

                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    bal = bal + deposit;
                    System.out.println("Money Deposited");
                    break;
                
                case 3:
                    System.out.println("Enter amount to Withdraw: ");
                    double withdraw = sc.nextDouble();

                    if(withdraw > bal){
                        System.out.println("Insufficient Balance!");
                    }
                    else{
                        bal = bal - withdraw;
                        System.out.println("Withdrawl Successful");
                    }
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
        while (choice != 4); 
    }
}
