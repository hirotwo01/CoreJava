package fundtransfer.service;

import fundtransfer.dto.Account;

import java.util.List;

public interface AccountService {
    void createAccount(Account account);

    Account findAccountByAccountNumber(String accountNumber);

    Float checkBalance(String accountNumber);

    List<Account> findAllAccount();

    void fundTransfer(String senderAccountNumber, String receiverAccountNumber, Float amount);
}
