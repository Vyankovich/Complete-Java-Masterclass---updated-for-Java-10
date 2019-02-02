package com.yankovich;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("12345-678", 1000.00);
//        System.out.println("Balance before transactions: " + account.getBalance());

        Thread tr1 = new Thread(() -> {
            account.deposit(300.00);
            account.withdraw(50.00);
            System.out.println("Balance of "+ account.getAccountNumber() + " is: " + account.getBalance());
        });

        Thread tr2 = new Thread(() -> {
            account.deposit(200.00);
            account.withdraw(100.00);
            System.out.println("Balance of "+ account.getAccountNumber() + " is: " + account.getBalance());
        });

        tr1.start();
        tr2.start();

    }
}
