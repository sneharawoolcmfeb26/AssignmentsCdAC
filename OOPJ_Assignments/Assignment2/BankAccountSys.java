/*13. Bank Account System 
Create a class BankAccount: 
Requirements: 
● Variables: accountNumber, name, balance 
● Use:
○ Default constructor 
○ Parameterized constructor 
● Display account details 
● Create multiple objects using different constructors  */

class BankAccount{
    int accNo;
    String name;
    double balance;

    BankAccount(){   //Default

    }
    BankAccount(int accNo, String name){  //Parameterizedd
        this.accNo = accNo;
        this.name = name;
    }
    
    BankAccount(int accNo, double balance){  //Parameterizedd
        this.accNo = accNo;
        this.balance = balance;
    }

    BankAccount(String name,double balance){  //Parameterizedd
        this.name = name;
        this.balance = balance;
    }
    

    BankAccount(int accNo, String name,double balance){  //Parameterizedd
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    //display details
    void display(){
        System.out.println("Account Number: "+accNo);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }
}


public class BankAccountSys {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount("Sneha", 100000);
        BankAccount b3 = new BankAccount(12345, 50000);
        BankAccount b4 = new BankAccount(59594, "Saylii");
        BankAccount b5 = new BankAccount(10394, "Ram", 39999999);

        b1.display();
        System.out.println("-------------------");
        b2.display();
        System.out.println("-------------------");
        b3.display();
        System.out.println("-------------------");
        b4.display();
        System.out.println("-------------------");
        b5.display();
    }
}
