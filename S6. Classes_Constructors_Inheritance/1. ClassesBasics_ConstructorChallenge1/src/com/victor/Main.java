package com.victor;

public class Main {
    public static void main(String[] args) {

        BankAccount victor = new BankAccount();//"123", 0.00, "Victor", "vic@tor.com", "(48)123-456");
        System.out.println(victor.getBalance());
        System.out.println(victor.getNumber());
        victor.deposit(5000);
        victor.withdrawal(12_000);
        victor.withdrawal(3000);

        System.out.println("*****************");

        BankAccount margoAccount = new BankAccount("Margo", "mar@go.com", "1234567");
        System.out.println(margoAccount.getNumber() + " name " + margoAccount.getCustomerName());


    }
}