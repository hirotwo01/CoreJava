package ClassObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccountIO {
    private BufferedReader bufferedReader=new BufferedReader( new InputStreamReader(System.in));
    public AccountIO() {
        System.out.println("Object is created");
    }

    /**
     *
     * @return
     */
    public Account readAccount() throws IOException {
        Account account=new Account();
        //i need to load data
        System.out.println("Enter account Id");
        account.setId(Integer.parseInt(bufferedReader.readLine()));
        System.out.println("Enter Account holder name");
        account.setAccountHolderName(bufferedReader.readLine());
        System.out.println("Enter account balance");
        account.setBalance(Float.parseFloat(bufferedReader.readLine()));
        System.out.println("Enter account type");
        account.setAccountType(bufferedReader.readLine());
        return  account;
    }

    public void displayAccount(Account account) {

    }
}
