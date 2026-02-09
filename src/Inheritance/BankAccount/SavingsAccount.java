package Inheritance.BankAccount;

public class SavingsAccount extends BankAccount{
    double IR;

    SavingsAccount(int accNo, String name, double bal, double rate) {
        super(accNo, name, bal);
        IR=rate;
    }
    double yearlyIR(){
        return (balance*IR)/100;
    }
    void displaySavingsAccount(){
        BankAccount ba= new BankAccount(accountNumber,accountName,balance);
        ba.displayBankAccount();
        System.out.println("Interest Rate:"+IR+"%");
        System.out.println("Yearly Interest:"+yearlyIR());
    }
}
