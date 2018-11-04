package com.victor;

import java.util.ArrayList;

/**
 * Created by dev on 03.11.2018.
 */
public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdraw(int amount) {
        if (amount < 0) {
            System.out.println("Incorrect input");
        } else {
            if (amount > this.balance) {
                System.out.println("Current balance is " + this.balance + ". Cannot withdraw more than actual balance is");
            } else {
                int withdrawal = -amount;
                transactions.add(withdrawal);
                this.balance += withdrawal;
                System.out.println(amount + " withdrawn. Balance is now " + this.balance);
            }
        }
    }

    public void calculateBalance() {
        this.balance = 0;
        for (int i : this.transactions) {
            this.balance += i;
        }
        System.out.println("Calculated balance is " + this.balance);
    }


}
