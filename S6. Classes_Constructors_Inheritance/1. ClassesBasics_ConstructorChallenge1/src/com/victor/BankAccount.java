package com.victor;

/*
challenge 1
create a new class for a bank account
create fields for the account number, balance, customer name, email, phone number.
 create getters and setters for each field
create two additional methods
1. to allow the customer to deposit funds (this should increment the balance field).
2. to allow the customer to withdrawal funds. This should deduct from the balance
field, but not allow the withdrawal to complete if their are insufficient funds.
You will want tot create various code in the Main class (the one created by IntelliJ)
to confirm your code is working.
add some println's in the two methods above as well.
*/
public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    // constructors

    // constructors can be invoked from another constructors
    public BankAccount() {
        // default constructor invokes constructor with parameters
        this("342", 1.1, "default", "default", "default");
        System.out.println("Empty constructor called");
    }

    // you do all your initialization in one constructor and the other constructors just call that major constructor. Good way of doing things.
// Cos you don't duplicate code (initialization) in more than one place.
    public BankAccount(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number; // in this case we've updated fields directly, we don't use setters. (it's better to use this approach)
        this.balance = balance; // you're guaranteed that the field values will be initialized.
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
        //setNumber(number); // in this case we use setter and conditions in it. Initialization may not have been finished (not recommend to do like this in a constructor)
    }

    public BankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        // default values plus provided values
        this("9999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
    }

    // methods deposit and withdrawal

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

}