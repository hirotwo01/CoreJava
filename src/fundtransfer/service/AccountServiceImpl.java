package fundtransfer.service;

import fundtransfer.dto.Account;
import fundtransfer.filehandler.FileFunctions;
import fundtransfer.io.AccountIO;

import java.util.List;

public class AccountServiceImpl extends AccountIO implements AccountService {

    FileFunctions fileFunctions = new FileFunctions();

    @Override
    public void createAccount(Account account) {
        fileFunctions.createNewAccountInFile(convertStringToAccount(account), Boolean.TRUE);
    }

    @Override
    public Account findAccountByAccountNumber(String accountNumber) {
        Account account = fileFunctions.findAccountByAccountNumber(accountNumber);
        if (account == null) {
            show("Account with account number " + accountNumber + " not found");
            return new Account();
        }
        return account;
    }

    @Override
    public Float checkBalance(String accountNumber) {
        Account account = findAccountByAccountNumber(accountNumber);
        return account.getBalance() == null ? 0.0f : account.getBalance();
    }

    @Override
    public List<Account> findAllAccount() {
        return fileFunctions.findAllAccount();
    }

    @Override
    public void fundTransfer(String senderAccountNumber, String receiverAccountNumber, Float amount) {
        List<Account> accountList = findAllAccount();
        String transactionLog;
        for (Account account : accountList) {
            if (account.getAccountNumber().equals(senderAccountNumber)) {
                account.setBalance(account.getBalance() - amount);
                transactionLog = "Deduction Tran:: " + senderAccountNumber + "," + receiverAccountNumber + "," + amount;
                fileFunctions.createTransactionRecord(transactionLog);
            }
            if (account.getAccountNumber().equals(receiverAccountNumber)) {
                account.setBalance(account.getBalance() + amount);
                transactionLog = "Addition Tran:: " + senderAccountNumber + "," + receiverAccountNumber + "," + amount;
                fileFunctions.createTransactionRecord(transactionLog);
                // log write
            }
        }

        fileFunctions.refreshFile(Boolean.FALSE);
        for (Account account : accountList) {
            fileFunctions.createNewAccountInFile(convertStringToAccount(account), Boolean.TRUE);
        }
    }
}
