#include <iostream> 
using namespace std;

class Employee{
    int empID;
    string empName;
    double empSalary;

    static int lastId;

    public:
    Employee(int id, string name,double salary){
        if(id > lastId) {
            empID = id;
            lastId = id;
        } else {
            cout << "Employee ID must be unique and greater than previous ID.\n";
            empID = 0; // invalid
        }

        empName = name;
        empSalary = salary;
    }

    void setEmpId(int id){
        if(id > lastId){
            empID = id;
            lastId = id;
        }
        else{
            cout <<"Employee Id must be unique\n";
        }
    }

    void setEmpName(string name){
        empName = name;
    }

    void setEmpSalary(double salary){
        empSalary = salary;
    }

    int getEmpID(){
        return empID;
    }
    string getEmpName(){
        return empName;
    }
    double getEmpSalary(){
        return empSalary;
    }

    double calculateGrossSalary(){
        double gross;

        if(empSalary <= 5000){
            gross = empSalary + (empSalary * 0.10);
        }else if(empSalary <=10000){
            gross = empSalary = (empSalary * 0.15);
        }else{
            gross = empSalary + (empSalary * 0.20);
        }
        return gross;
    }

    void displayEmployeeDetails(){
        cout <<"\nEmployee Details: \n";
        cout <<"ID: "<<empID<<endl;
        cout <<"Name: "<<empName<<endl;
        cout <<"Salary: "<<empSalary<<endl;
        cout <<"Gross Salary: "<<calculateGrossSalary()<<endl;
    }
};

int Employee::lastId = 0;

int main(){
    int id;
    string name;
    double salary;

    cout <<"Enter Employee ID: ";
    cin >> id;
    cout <<"Enter Name: ";
    cin >> name;
    cout <<"Enter Salary: ";
    cin >> salary;

    Employee emp(id, name, salary);

    int choice;

    do{
        cout <<"\n1. Display Details";
        cout <<"\n2. Update Name";
        cout <<"\n3. Update Salary";
        cout <<"\n4. Exit";
        cout <<"\nEnter choice: ";
        cin >> choice;

        switch (choice)
        {
        case 1:
        emp.displayEmployeeDetails();
        break;

        case 2:
        cout << "Enter New Name: ";
        cin >> name;
        emp.setEmpName(name);
        break;

        case 3:
        cout << "Enter New Salary: ";
        cin >> salary;
        emp.setEmpSalary(salary);
        break;

        case 4:
        cout <<"Exiting..\n";
        break;

        default:
        cout << "Invslid choice\n";
    }
}
while(choice !=4);
return 0;
}
