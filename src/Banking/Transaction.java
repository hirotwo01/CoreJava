package Banking;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionID;
    private int accountNumber;
    private String transactionType;
    private int amount;
    private LocalDateTime dateAndTime;
    private double balanceAfter;

    public Transaction(String transactionID, int accountNumber, String transactionType, int amount, LocalDateTime dateAndTime, double balanceAfter) {
        this.transactionID = transactionID;
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.dateAndTime = dateAndTime;
        this.balanceAfter = balanceAfter;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public double getBalanceAfter() {
        return balanceAfter;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDateAndTime(LocalDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public void setBalanceAfter(double balanceAfter) {
        this.balanceAfter = balanceAfter;
    }
    public String sendToFile(){
        return transactionID+","+accountNumber+","+transactionType+","+amount+","+dateAndTime+","+balanceAfter;
    }
}
