package fundtransfer.io;

import fundtransfer.dto.Account;

public class AccountIO extends ReadDisplay {

    public Account readAccount() {
        return new Account(
                readLine("Enter account holder name"),
                readLine("Enter account number"),
                Float.parseFloat(readLine("Enter initial balance"))
        );
    }

    public String convertStringToAccount(Account account) {
        StringBuilder stringAccount = new StringBuilder();
        stringAccount.append(account.getAccountHolderName());
        stringAccount.append(",");
        stringAccount.append(account.getAccountNumber());
        stringAccount.append(",");
        stringAccount.append(account.getBalance());
        return  stringAccount.toString();
    }

    public void display(Account account) {
        showLine();
        show("Account holder name: " + account.getAccountHolderName());
        show("Account number: " + account.getAccountNumber());
        show("Account balance: " + account.getBalance());
        showLine();
    }

}
