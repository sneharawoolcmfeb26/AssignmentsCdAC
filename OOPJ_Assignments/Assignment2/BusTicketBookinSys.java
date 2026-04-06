/*Bus Ticket Booking System 
Create a program for booking bus seats. 
Requirements 
● Assume a bus has 10 seats. 
● Use an array to mark seats as booked or available. 
● Show a menu: 
1. View Available Seats 
2. Book a Seat 
3. Cancel a Seat 
4. Exit 
● Do not allow double booking */

import java.util.Scanner;

public class BusTicketBookinSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        // Create array for 10 seats
        // 0 means seat is available
        // 1 means seat is booked
        int seats[] = new int[10];

        int choice = 0;  // Variable to store user choice

        while (choice !=4){
            System.out.println("\n1. View Seats");
            System.out.println("2. Book Seats");
            System.out.println("3. Cancel Seats");
            System.out.println("4. Exit ");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();

            //1. View all seats
            if (choice == 1) {
                //loop through all 10 seats
                for(int i = 0; i < 10; i++){  
                    if(seats[i]==0){  //check if seat is available
                        System.out.println("Seat "+ (i+1)+" Available");
                    }
                    //else it is booked
                    else{
                        System.out.println("Seat "+(i+1)+" Booked");
                    }
                }
            }

            //2. Book a seat
                else if(choice == 2){
                    //ask for seat number
                    System.out.println("Enter Seat number (1-10: ");
                    int s = sc.nextInt();

                    //check if seat number is valid
                    if (s < 1 || s > 10) {
                        System.out.println("Invalid Seat!");
                    }
                    //check if seat already booked
                    else if(seats[s - 1] == 1){
                        System.out.println("Already booked!");
                    }
                    //Otherwise book a seat
                    else{
                        seats[s - 1] = 1;
                        System.out.println("Seat booked!");
                    }
                }

                //3. Cancel a seat
                else if(choice == 3){
                    System.out.println("Enter seat number (1-10): ");
                    int s = sc.nextInt();

                    //Check if seat is valid
                    if (s < 1 || s > 10) {
                        System.out.println("Invalid seat!");
                    }
                    //check if seat is already empty
                    else if(seats[s - 1]==0){
                        System.out.println("Already empty!");
                    }
                    //otherwise cancel booking
                    else{
                        seats[s - 1]=0;  //Mark seat as available
                        System.out.println("Seat cancelled!");
                    }
                }
                //4. Exit program
                else if(choice == 4){
                    System.out.println("Thank you!");
                }
                else{
                    System.out.println("Wrong choice!");
                }
        }
    }
}
