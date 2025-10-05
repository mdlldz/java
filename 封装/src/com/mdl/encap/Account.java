package com.mdl.encap;

public class Account {
    private String name;
    private double balance;
    private String password;

    public Account() {

    }

    public Account(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 2 || name.length() == 3 || name.length() == 4) {
            this.name = name;
        } else {
            System.out.println("输入的名字不合理");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 20) {
            this.balance = balance;
        } else {
            System.out.println("余额不足，无法创建");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码需要为六位");
        }
    }

    public String info() {
       return "名字为" + name + "余额为" + balance + "密码为" + password;
    }
}
