/*8. Hospital Patient Record System 
Create a simple patient management program. 
Requirements 
● Create a class Patient with: 
○ patient ID 
○ patient name 
○ age 
○ disease 
● Create objects for at least 3 patients. 
● Display patient details. 
● Add a method to check whether the patient is a senior citizen (age 60 or above) */

class Patient {
    int PID;
    String Pname;
    int PAge;
    String Pdisease;

    //Constructor to initialize patient details
    Patient(int pid, String pname, int pAge, String pdisease){
        this.PID = pid;
        this.Pname = pname;
        this.PAge = pAge;
        this.Pdisease = pdisease;
    }

    //Print details
    void Pdisplay(){
        System.out.println("Patient ID: "+PID);
        System.out.println("Patient Name: "+Pname);
        System.out.println("Patient Age: "+PAge);
        System.out.println("Disease: "+Pdisease);
    }

    //Method to check SeniorCitizen
    void CkeckSeniorCitzen(){
        if(PAge >= 60){
            System.out.println("Senior Citizen");
        }
        else{
            System.out.println("Not Senior Citizen");
        }
    }
}

public class HospitalPatientRecordSys {
    public static void main(String[] args) {
        //Object Creation
        Patient p1 = new Patient(101, "Sneha", 32, "Thyroid");
        Patient p2 = new Patient(102, "Sayli", 73, "LossMotion");
        Patient p3 = new Patient(103, "Ram", 68, "Cancer");

        p1.Pdisplay();  //Call display method
        p1.CkeckSeniorCitzen();  //Check senior citizen

        p2.Pdisplay();   //Call display method
        p2.CkeckSeniorCitzen();  //Check senior citizen

        p3.Pdisplay();   //Call display method
        p3.CkeckSeniorCitzen();  //Check senior citizen


    }
}
