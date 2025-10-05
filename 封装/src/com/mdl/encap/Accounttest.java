package com.mdl.encap;

public class Accounttest {
        public static void main(String [] args){
            Account account = new Account();
            account.setName("jacksmith");
            account.setBalance(6);
            account.setPassword("12345678");
            System.out.println(account.info());
        }
}
