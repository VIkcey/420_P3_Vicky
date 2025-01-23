package com.ModellingClasses;

public class BankAccount2 {

    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount2(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Optional: Getter for accountNumber, if needed
    public String getAccountNumber() {
        return accountNumber;
    }

}
