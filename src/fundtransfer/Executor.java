package fundtransfer;

import fundtransfer.filehandler.FileFunctions;
import fundtransfer.io.AccountIO;
import fundtransfer.service.AccountService;
import fundtransfer.service.AccountServiceImpl;

public class Executor extends AccountIO {
    public static void main(String[] args) {
        new Executor();
    }

    public Executor() {
        Boolean isRunning = Boolean.TRUE;
        AccountService accountService = new AccountServiceImpl();
        FileFunctions fileFunctions = new FileFunctions();
        fileFunctions.init();
        while (isRunning) {
            showLine();
            show("1 Create account");
            show("2 Check balance");
            show("3 Fund Transfer");
            show("4 Load Fund");
            show("5 Transaction Report");
            show("6 Exit");
            int choice = Integer.parseInt(readLine("Enter your choice !!"));
            switch (choice) {
                case 1:
                    accountService.createAccount(readAccount());
                    show("Account created successfully");
                    break;
                case 2:
                    String accountNumber = readLine("Enter account number");
                    Float balance = accountService.checkBalance(accountNumber);
                    show("Balance is " + balance);
                    break;
                case 3:
                    String senderAccountNumber = readLine("Enter sender account number");
                    // validate
                    String receiverAccountNumber = readLine("Enter receiver account number");
                    // validate
                    Float amount = Float.parseFloat(readLine("Enter amount"));
                    // validate
                    accountService.fundTransfer(senderAccountNumber, receiverAccountNumber, amount);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    isRunning = Boolean.FALSE;
                    show("Thank you !!!");
                    showLine();
                    break;
                default:
                    show("Invalid choice");
            }
        }
    }
}
