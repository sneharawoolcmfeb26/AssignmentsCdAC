/* 5. Employee Salary Slip Generator 
Create a Java program to generate salary slips for employees. 
Requirements 
Accept employee name, ID, basic salary. 
● Calculate: 
○ HRA = 20% of basic salary 
○ DA = 10% of basic salary 
○ PF = 8% of basic salary 
● Calculate net salary. 
● Display a formatted salary slip.*/

import java.util.Scanner;

class EmpSalarySlip{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Emp name: ");
        String empname = sc.nextLine();

        System.out.println("Enter Employee ID: ");
        int empid = sc.nextInt();

        System.out.println("Basic Salary: ");
        double basicSalary = sc.nextDouble();

        //Calculations
        double HRA = 0.20 * basicSalary;
        double DA = 0.10 * basicSalary;
        double PF = 0.08 * basicSalary;

        double netSalary = basicSalary + HRA + DA - PF;

        //Salary Slip
        System.out.println("=====SALARY SLIP=====");
        System.out.println("Employee Name: "+empname);
        System.out.println("Employee ID:"+empid);
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("HRA 20% : "+HRA);
        System.out.println("DA 10% : "+DA);
        System.out.println("PF 18% : "+PF);
        System.out.println("Net Salary : "+netSalary);
        
    }
}