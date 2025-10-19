package com.exercise7;
class BankAccount{
    public int balance;
    public BankAccount(double initialBalance){
        this.balance = (int)initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
}
