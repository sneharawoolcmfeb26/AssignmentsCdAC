/*Question 3: Design a Banking System 
Requirements: 
Each account has: 
● Account number, holder name 
● Balance 
System should: 
● Store multiple accounts 
● Deposit & withdraw money 
● Prevent withdrawal if balance is insufficient 
● Track total number of accounts  
Support: 
● Overloaded methods for deposit (cash / online) 
Display: 
● Account details with updated balance 
*/

class Account{
    int accnum;
    String holdernm;
    double balance;

    static int totalacc = 0;

    Account(int accnum, String holdernm, double balance){
        this.accnum = accnum;
        this.holdernm = holdernm;
        this.balance = balance;
        totalacc++;
    }

    void deposit(double amt){
        balance += amt;
        System.out.println("Cash Deposited"+amt);
    }

    void deposit(double amt,String mode){
        balance += amt;
        System.out.println("Online Deposited through "+mode+": "+amt);
    }

    void withdrawal(double amt){
        if(amt > balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance -= amt;
            System.out.println("Withdrawn: "+amt);
        }
    }
    //display
    void display(){
        System.out.println("-----Account Details-----");
        System.out.println("Account No.: "+accnum);
        System.out.println("Name: "+holdernm);
        System.out.println();
    }
}

public class BankingSystem {
   public static void main(String[] args) {
    
   } 
}
