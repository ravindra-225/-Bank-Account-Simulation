package com.example.bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Account {
	private String acctnumb;
	private double balance;
	private List<Transaction> transaction;
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	private class Transaction {
	        private String type;
	        private double amount;
	        private double balanceAfter;
	        private String timestamp;

	        public Transaction(String type, double amount, double balanceAfter) {
	            this.type = type;
	            this.amount = amount;
	            this.balanceAfter = balanceAfter;
	            this.timestamp = LocalDateTime.now().format(formatter);
	        }
	        @Override
	        public String toString() {
	            return String.format(" %s: $%.2f, Balance: $%.2f, %s",  type, amount, balanceAfter, timestamp);
	        }
		}
	public Account(String accountNumber, double initialBalance) {
	            this.acctnumb = accountNumber;
	            this.balance = initialBalance;
	            this.transaction = new ArrayList<>();
	            if (initialBalance > 0) {
	                transaction.add(new Transaction("Initial Deposit", initialBalance, initialBalance));
	            }
	        }

	        public void deposit(double amount) {
	            if (amount <= 0) {
	                throw new IllegalArgumentException("Deposit amount must be positive");
	            }
	            balance += amount;
	            transaction.add(new Transaction("Deposit", amount, balance));
	        }

	        public void withdraw(double amount) {
	            if (amount <= 0) {
	                throw new IllegalArgumentException("Withdrawal amount must be positive");
	            }
	            if (amount > balance) {
	                throw new IllegalArgumentException("Insufficient funds");
	            }
	            balance -= amount;
	            transaction.add(new Transaction("Withdrawal", amount, balance));
	        }

	        public double getBalance() {
	            return balance;
	        }

	        public String getAccountNumber() {
	            return acctnumb;
	        }

	        public List<String> getTransactionHistory() {
	            List<String> history = new ArrayList<>();
	            for (Transaction t : transaction) {
	                history.add(t.toString());
	            }
	            return history;
	        }
	}

