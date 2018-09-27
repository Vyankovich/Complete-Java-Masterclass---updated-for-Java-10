package com.victor;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    // constructors

// constructors can be invoked from another constructors

    public BankAccount() {
        this("342",1.1,"default", "default","default"); // default constructor invokes constructor with parameters
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }


    // getters and setters

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // methods

    void deposit(double deposit) {
        this.balance += deposit;
        System.out.println("Deposit of " + deposit + ". New balance is " + this.balance);
    }

    void withdrawal(double withdrawal) {
        if (this.balance - withdrawal < 0) {
            System.out.println("It's not possible to withdraw " + withdrawal + " Available balance is " + this.balance);
        } else {
            this.balance -= withdrawal;
            System.out.println("Withdrawal of " + withdrawal + ". New balance is " + this.balance);
        }
    }
}
