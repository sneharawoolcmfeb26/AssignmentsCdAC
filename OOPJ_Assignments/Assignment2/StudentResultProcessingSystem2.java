/*Student Result Processing System 
Create a program for a school to manage a student’s marks. 
Requirements 
● Accept student name, roll number, and marks in 5 subjects. 
● Calculate total, average, percentage. 
● Display grade using conditions: 
○ 90 and above → A 
○ 75 to 89 → B 
○ 60 to 74 → C 
○ 40 to 59 → D 
C-DAC Mumbai
○ Below 40 → Fail 
● Show whether the student is promoted or not.  */

import java.util.Scanner;

public class StudentResultProcessingSystem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student name: ");
        String name = sc.nextLine();

        System.out.println("Enter Roll number: ");
        int roll = sc.nextInt();

        System.out.println("Enter marks: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;

        double average = total / 5.0;

        double percentage = (total/500.0) * 100;

        String grade;

        if(percentage >=90){
            grade = "A";
        }
        else if(percentage >=75 ){
            grade = "B";
        }
        else if(percentage >=60){
            grade = "C";
        }
        else if(percentage >= 40){
            grade = "D";
        }
        else{
            grade = "Fail";
        }

        System.out.println("-----Result-----");
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+roll);
        System.out.println("Total Marks: "+total);
        System.out.println("Average: "+average);
        System.out.println("Percentage: "+percentage);
        System.out.println("Grade: "+grade);
        
        if(percentage < 40) {
            System.out.println("Status: NOT PROMOTED");
        } else {
            System.out.println("Status: PROMOTED");
        }
    }   
}
