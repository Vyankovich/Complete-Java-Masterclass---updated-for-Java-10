package com.victor;

public class Main {
    // create a simple banking application
// there should be a Bank class
// It should have an arrayList of Branches
// Each Branch should have an arrayList of Customer
// The Customer class should have an arrayList of Doubles (transactions)
// Customer:
// Name, and ArrayList of doubles
// Branches:
// Need to be able ro add a new customer and initial transaction amount.
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstrate autoboxing and outboxing in your code
//  Add data validation, e.g. check if exists, or does not exist, etc.
// think about where you are adding your code to perform certain actions
//
    public static void main(String[] args) {


        Bank bank = new Bank("Bank ABC");
        bank.newBranch("A-branch");
        bank.addCustomer("A-branch","Victor", 100.01);
        bank.addCustomer("A-branch","Tim", 120.2);
        bank.addCustomer("A-branch","John", 10.4);

        bank.newBranch("B-branch");
        bank.addCustomer("B-branch","Bob", 5.5);

        bank.addCustomerTransaction("A-branch","Victor", 50);
        bank.addCustomerTransaction("A-branch","Tim", 50);
        bank.addCustomerTransaction("A-branch","Victor", 50);

        bank.listCustomers("A-branch", true);

        bank.addCustomerTransaction("A-branch", "Wictor",111);
        bank.newBranch("A-branch");


    }
}
