package ClassObject;

public class Account {
    private int id;
    private String accountHolderName;
    private String accountType;
    private float balance;
    private static String bankName;

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public static void setBankName(String bankName) {
        Account.bankName = bankName;
    }
}
