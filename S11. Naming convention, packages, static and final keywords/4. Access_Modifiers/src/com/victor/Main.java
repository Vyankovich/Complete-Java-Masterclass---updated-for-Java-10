package com.victor;

public class Main {

    public static void main(String[] args) {

        Account account = new Account("ACC001");
        account.deposit(100);
        account.withdraw(200);
        account.deposit(-100);
        account.withdraw(-50);
        account.calculateBalance();
        //account.balance = 5000;
        //account.transactions.add(4500);


        System.out.println("Balance on the account is " + account.getBalance());
    }
}
