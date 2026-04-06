/*Question 1: Design a College ERP (Student Module) 
Requirements: 
● Each student has: 
○ Roll number, name 
○ Marks in multiple subjects 
○ Contact details (phone, email) 
● System should: 
○ Store multiple students 
○ Calculate total & average marks 
○ Track total students admitted 
● Support: 
○ Flexible average calculation 
● Display formatted student report */

import java.util.Scanner;

class Student{
    int roll;
    String name;
    double marks[];
    String phone;
    String email;

    static int count = 0;

    Student(int r, String nm, double m[], String p, String e){
        roll = r;
        name = nm;
        marks = m;
        phone = p;
        email = e;
        count++;
    }

    //Calculate Total
    double gettotal(){
        double total = 0;
        for(int i = 0; i < marks.length; i++){
            total += marks[i];
        }
        return total;
    } 

    //Calculate average
    double getAverage(){
        return gettotal() / marks.length;
    }

    //Display details
    void display(){
        System.out.println("-----Student Report-----");
        System.out.println("Roll no: "+roll);
        System.err.println("Name: "+name);

        System.out.println("Marks: ");
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i]+" ");
        }

        System.out.println("\nTotal: "+gettotal());
        System.out.println("Average: "+getAverage());
        System.out.println("Phone: "+phone);
        System.out.println("Email:"+email);
    }
}

public class CollegeERP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Students: ");
        int n = sc.nextInt();

        Student s[] = new Student[n];  //Array of object
        for(int i = 0; i < n; i++){
            System.out.println("Enter details for Students "+(i+1));

            System.out.println("Roll no: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Enter number of Subjects: ");
            int sub = sc.nextInt();

            double marks[] = new double[sub];

            for(int j = 0; j < sub; j++){
                System.out.println("Enter marks: ");
                marks[j] = sc.nextDouble();
            }
            sc.nextLine();

             System.out.print("Phone: ");
            String phone = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            // create object
            s[i] = new Student(roll, name, marks, phone, email);
        }

        // Display all students
        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        // total students
        System.out.println("\nTotal Students: " + Student.count);
        
    }
    
}
