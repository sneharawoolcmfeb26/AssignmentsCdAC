#include <iostream> 
using namespace std;

class BankAccount {
    int AccountNumber;
    string accountHolderName;
    double balance;

public:
void setAccountNum(int AN){
    AccountNumber = AN;
}
void setAccHolderNm(string AHN){
    accountHolderName = AHN;
}
void setBalance(double Bal){
    balance = Bal;
}

int getAccountNum(){
    return AccountNumber;
}
string getaccountHolderName(){
    return accountHolderName;
}
double getBalance(){
    return balance;
}

void deposit(double amount){
    if(amount>0){
    balance += amount; 
    cout << "Amount deposited"<<endl;
    }else{
        cout << "Invalid deposit Amount "<<endl;
    }
}

void withdraw(double amount){
    if(amount<=0){
        cout << "Invalid withdrawal amount"<<endl;
    }else if(amount>balance){
        cout << "Insufficient balance" <<endl;
    }
    else{
        balance -=amount;
        cout<< "Money withdrawal successfully"<<endl;
    }
}

void displayAccountDetails(){
    cout << "-----Account Details-----\n";
    cout << "Account number: " << AccountNumber << endl;
    cout << "Account Holder name: " << accountHolderName << endl;
    cout << "Current Balance: " << balance << endl;
}
};

int main(){
    BankAccount bacc;
    int accnum, choice;
    string name;
    double Balance, amount;

    cout << "Enter Account Number: "<< endl;
    cin >> accnum;

    cout << "Enter Account Holder name: "<< endl;
    cin >> name;

    cout << "Enter Balance: "<< endl;
    cin >> Balance;

    bacc.setAccountNum(accnum);
    bacc.setAccHolderNm(name);
    bacc.setBalance(Balance);

    do{
        cout << "\n1.Deposit\n";
        cout << "\n2.Withdraw\n";
        cout << "\n3.Display Details\n";
        cout << "\n4. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;
        
        switch (choice)
        {
        case 1:
            cout << "Enter amount to Deposit: ";
            cin >> amount;
            bacc.deposit(amount);
            break;
           
        case 2:
            cout << "Enter amount to Withdraw: ";
            cin >> amount;
            bacc.withdraw(amount);
            break;

        case 3:
            bacc.displayAccountDetails();
            break;

        case 4:
        cout << "Exit\n";
        break; 
        
        default:
            cout << "Invalid choice\n";
            break;
        }
    }while(choice !=4);

    return 0;
}
