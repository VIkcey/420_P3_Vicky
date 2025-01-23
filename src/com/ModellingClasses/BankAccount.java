package com.ModellingClasses;

public class BankAccount {

    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }


    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 1000.00);

        account.deposit(500.00);

        boolean success = account.withdraw(200.00);
        System.out.println("Withdraw successful: " + success);

        System.out.println("Current Balance: " + account.getBalance());
    }

}
