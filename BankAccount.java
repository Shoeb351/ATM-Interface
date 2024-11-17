package ATM;

import java.util.ArrayList;

public class BankAccount {
    private double balance;
    public ArrayList<String> transactionHistory;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited: " + amount);
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: " + amount);
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }

    public boolean transfer(double amount, BankAccount recipient) {
        if (withdraw(amount)) {
            recipient.deposit(amount);
            transactionHistory.add("Transferred: " + amount);
            return true;
        }
        return false;
    }

    public void printTransactionHistory() {
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
