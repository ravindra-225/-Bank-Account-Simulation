package com.example.bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine(); 
        Account account = new Account(accountNumber, initialBalance);

        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = Double.parseDouble(scanner.nextLine());
                        account.deposit(depositAmount);
                        System.out.printf("Deposited $%.2f. New balance: $%.2f%n", depositAmount, account.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = Double.parseDouble(scanner.nextLine());
                        account.withdraw(withdrawAmount);
                        System.out.printf("Withdrawn $%.2f. New balance: $%.2f%n", withdrawAmount, account.getBalance());
                        break;
                    case 3:
                        System.out.printf("Current balance: $%.2f%n", account.getBalance());
                        break;
                    case 4:
                        System.out.println("\n=== Transaction History ===");
                        for (String transaction : account.getTransactionHistory()) {
                            System.out.println(transaction);
                        }
                        break;
                    case 5:
                        System.out.println("Exiting Bank Account Simulation. Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please select 1-5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            } 
        }
    }

    private static void displayMenu() {
        System.out.println("\n===Welcome To Bank Account Simulation ===");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. View Transaction History");
        System.out.println("5. Exit");
    }
}
