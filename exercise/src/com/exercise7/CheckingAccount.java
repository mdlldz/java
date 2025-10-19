package com.exercise7;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    public void deposit(double amount) {
        balance += amount - 1;
    }

    public void withdraw(double amount) {
        balance -= amount + 1;
    }
}

