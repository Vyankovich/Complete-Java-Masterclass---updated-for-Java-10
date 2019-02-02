package com.yankovich;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by vyankovich on 2019-01-30
 */
class BankAccount {

    private String accountNumber;
    private double balance;
    private Lock lock; // 2

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.lock = new ReentrantLock();
    }

    public void deposit(double amount) {
/*        synchronized (this) {
            this.balance += amount;
        }*/ // 1 option
/*        lock.lock();
        try {
            this.balance -= amount;
        } finally {
            lock.unlock();
        }*/ // 2nd option
        boolean status = false;
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    this.balance += amount;
                    status = true;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }
        } catch (InterruptedException e) {
            // do something
        }
        System.out.println("Transaction status = " + status);
    }

    public void withdraw(double amount) {
/*        synchronized (this) {
            this.balance -= amount;
        }*/ // 1option
/*        lock.lock();
        try {
            this.balance -= amount;
        } finally {
            lock.unlock();
        }*/ // 2nd option
        boolean status = false;
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    this.balance -= amount;
                    status = true;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }
        } catch (InterruptedException e) {
            // do something
        }
        System.out.println("Transaction status = " + status);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public synchronized double getBalance() {
        return balance;
    }

    public void printAccountNumber() {
        System.out.println("Account number is " + accountNumber);
    }
}
