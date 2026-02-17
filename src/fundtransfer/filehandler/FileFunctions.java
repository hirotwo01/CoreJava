package fundtransfer.filehandler;

import fundtransfer.dto.Account;
import fundtransfer.io.ReadDisplay;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class FileFunctions extends ReadDisplay {
    String directoryPath = System.getProperty("user.home")
            + File.separator
            + "Desktop"
            + File.separator
            + "accounts";
    String accountPath = directoryPath + File.separator + "accounts.txt";
    String transactionPath = directoryPath + File.separator + "transaction.txt";

    public void init() {
        try {
            File directoryFile = new File(directoryPath);
            if (!directoryFile.exists()) {
                directoryFile.mkdirs();
            }
            // File creation start !!
            File accountFile = new File(accountPath);
            File transactionFile = new File(transactionPath);
            FileWriter accountFileWriter = new FileWriter(accountFile, true);
            accountFileWriter.close();
            FileWriter transactionFileWriter = new FileWriter(transactionFile, true);
            transactionFileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void createNewAccountInFile(String string, Boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(accountPath, append);
            fileWriter.write(string);
            fileWriter.write("\n");
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void refreshFile(Boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(accountPath, append);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Account> findAllAccount() {
        try {
            List<Account> accountList = new ArrayList<>();
            Scanner scanner = new Scanner(new FileReader(accountPath));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String data[] = line.split(",");
                accountList.add(new Account(data[0], data[1], Float.parseFloat(data[2])));
            }
            return accountList;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public Account findAccountByAccountNumber(String accountNumber) {
        List<Account> accountList = findAllAccount();
        Optional<Account> optionalAccount = accountList.stream().filter(account -> account.getAccountNumber().equals(accountNumber)).findFirst();
        if (optionalAccount.isPresent()) {
            return optionalAccount.get();
        } else {
            return null;
        }
    }


    public void createTransactionRecord(String transactionString) {
        try {
            FileWriter fileWriter = new FileWriter(transactionPath, Boolean.TRUE);
            fileWriter.write(transactionString);
            fileWriter.write("\n");
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
