package ATM;

import java.util.Scanner;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        BankAccount account = new BankAccount(1000.0);  // Initial balance of 1000
        User user = new User("user123", "1234", account);


        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();


        if (user.getUserId().equals(userId) && user.getPin().equals(pin)) {
            System.out.println("Login successful!");

            boolean exit = false;
            while (!exit) {
                ATMOperations.displayMenu();
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        ATMOperations.withdraw(account, scanner);
                        break;
                    case 2:
                        ATMOperations.deposit(account, scanner);
                        break;
                    case 3:
                        ATMOperations.transfer(account, scanner);
                        break;
                    case 4:
                        ATMOperations.showTransactionHistory(account);
                        break;
                    case 5:
                        System.out.println("Thank you for using the ATM!");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            }
        } else {
            System.out.println("Invalid user ID or PIN.");
        }

        scanner.close();
    }
}

