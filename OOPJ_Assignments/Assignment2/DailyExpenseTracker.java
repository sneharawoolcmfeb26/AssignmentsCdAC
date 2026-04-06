/*9. Daily Expense Tracker 
Create a program to track a person’s daily expenses. 
Requirements 
● Accept expenses for 7 days in an array. 
● Calculate: 
○ total weekly expense 
○ average expense 
○ highest expense 
○ lowest expense 
● Display the day on which the highest expense occurred */

import java.util.Scanner;

public class DailyExpenseTracker {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    double expenses[] = new double[7];  //Array to store 7 days expenses

    double total = 0;  //store total expenses
    double highest, lowest;
    int highestDay = 0;

    //Input expenses for 7 days
    for(int i = 0; i < 7; i++){
        System.out.println("Enter expenses for day "+(i+1)+": ");
        expenses[i] = sc.nextDouble();
    }

    //Initialize highest & lowest with first day value
    highest = expenses[0];
    lowest = expenses[0];

    //Loop to calculate total, highest, lowest
    for(int i = 0; i < 7; i++){
        total +=expenses[1];  //Add total
        
        //Check for highest expenses
        if(expenses[i] > highest){
            highest = expenses[i];
            highestDay = i;   //Store index of highest day
        }

        //Check for lowest expenses
        if(expenses[i] < lowest){
            lowest = expenses[i];
        }
    }

    //Calculate average
    double average = total / 7;

    // Display results
        System.out.println("\n----- EXPENSE REPORT -----");
        System.out.println("Total Expense   : " + total);
        System.out.println("Average Expense : " + average);
        System.out.println("Highest Expense : " + highest);
        System.out.println("Lowest Expense  : " + lowest);

        // Display day of highest expense
        System.out.println("Highest on Day  : Day " + (highestDay + 1));
    }

}
