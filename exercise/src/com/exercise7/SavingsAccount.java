package com.exercise7;

public class SavingsAccount extends BankAccount{
    private double rate = 0.1;
    private int count = 3;
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
        }
        else{
            super.deposit(amount - 1);
        }
        count--;
    }
    public void withdraw(double amount){
        if (count > 0) {
            super.withdraw(amount );
        }
        else{
            super.withdraw(amount + 1);
        }
        count--;
    }
    public void Math(){
        count = 3;
        super.deposit(getBalance() * rate);
    }
}
