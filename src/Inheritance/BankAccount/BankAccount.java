package Inheritance.BankAccount;

public class BankAccount {
    int accountNumber;
    String accountName;
    double balance;
    BankAccount(int accNo,String name, double bal){
        accountName=name;
        accountNumber=accNo;
        balance=bal;
    }
    void displayBankAccount(){
        System.out.println("Account Holdername:"+accountName);
        System.out.println("Account Number"+accountNumber);
        System.out.println("Balance:"+balance);
    }
}
