package ClassObject;

import java.io.IOException;

public class AccountRunner {
    public static void main(String[] args) throws IOException {
AccountIO accountIO= new AccountIO();
Account account = accountIO.readAccount();
        System.out.println(account);
        accountIO.displayAccount(account);
    }
}
/**
 * Account account1 = new Account();
 *         account1.setId(100);
 *         account1.setAccountHolderName("Kalash Manandhar");
 *         account1.setAccountType("Saving");
 *         account1.setBalance(11110.5f);
 *         System.out.println(account1);
 *         Account account2 = new Account();
 *         account1.setId(101);
 *         account1.setAccountHolderName("Kalash Manandhar");
 *         account1.setAccountType("FD");
 *         account1.setBalance(11111.5f);
 *         System.out.println(account2);
 */
