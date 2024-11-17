package ATM;

public class User {
    private String userId;
    private String pin;
    private BankAccount account;

    public User(String userId, String pin, BankAccount account) {
        this.userId = userId;
        this.pin = pin;
        this.account = account;
    }

    public String getUserId() {
        return userId;
    }

    public String getPin() {
        return pin;
    }

    public BankAccount getAccount() {
        return account;
    }
}
