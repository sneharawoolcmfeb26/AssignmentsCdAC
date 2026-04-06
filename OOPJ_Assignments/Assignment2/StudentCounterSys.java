/*12. Student Counter System 
Create a class Student: 
Requirements: 
● Instance variables: name, rollNo 
● Static variable: totalStudents 
● Increment totalStudents every time object is created 
● Display total number of students 
Bonus: Add a static method to display count */

class Student{
    String name;    //Instace variable
    int rollNo;     //Instace variable

    static int totalStudents = 0;

    Student(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
        totalStudents++;
    }
    static void displayCount(){
        System.out.println("Total Students: "+totalStudents);
    }
}

public class StudentCounterSys {
    public static void main(String[] args) {
        Student s1 = new Student("Sneha", 1);
        Student s2 = new Student("Ram", 2);
        Student s3 = new Student("Sayli", 3);
        Student s4 = new Student("Rita", 4);
        
        Student.displayCount();
        
    }
}
