package ATM;

import java.util.Scanner;

public class ATMOperations {
    public static void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Transfer");
        System.out.println("4. Transaction History");
        System.out.println("5. Quit");
    }

    public static void withdraw(BankAccount account, Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
        }
    }

    public static void deposit(BankAccount account, Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Deposit successful. New balance: " + account.getBalance());
    }

    public static void transfer(BankAccount sender, Scanner scanner) {
        System.out.print("Enter recipient's account number: ");
        String recipientAccountNumber = scanner.next();

        BankAccount recipient = new BankAccount(0);
        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        if (sender.transfer(amount, recipient)) {
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Transfer failed.");
        }
    }

    public static void showTransactionHistory(BankAccount account) {
        account.printTransactionHistory();
    }
}

