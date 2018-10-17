package com.victor;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by dev on 13.10.2018.
 */
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
public class Bank {
    private String name;
    private ArrayList<Branches> branch;

    public Bank(String name) {
        this.name = name;
        this.branch = new ArrayList<Branches>();
    }

    public boolean newBranch (String name) {
        if (findBranch(name) != null) {
            System.out.println("Error of adding new branch");
            return false;
        }
        this.branch.add(new Branches(name));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branches existingBranch = findBranch(branchName);
        if (existingBranch == null) {
            System.out.println("Error of adding new customer to non-existing branch");
            return false;
        }
        existingBranch.newCustomer(customerName, initialAmount);
        return true;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branches existingBranch = findBranch(branchName);
        if (existingBranch == null) {
            System.out.println("Error of adding new transaction");
            return false;
        }
        existingBranch.addTransaction(customerName,amount);
        return true;
    }

    private Branches findBranch(String nameOfBranch) {
        for (int i = 0; i < this.branch.size(); i++) {
            Branches branch = this.branch.get(i);
            if (branch.getName().equals(nameOfBranch)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers (String branchName, boolean showTransactions) {
        Branches existingBranch = findBranch(branchName);
        if (existingBranch == null) {
            System.out.println("Unable to list customers for non-existing branch");
            return false;
        }
        System.out.println(existingBranch.getName() + ". List of customers:");
        ArrayList<Customer> branchCustomers = existingBranch.getCustomers();
        for (int i = 0; i < branchCustomers.size(); i++) {
            Customer customer = branchCustomers.get(i);
            System.out.println((i+1) + ". " + customer.getName());
            if (showTransactions) {
                System.out.println("Transactions");
                ArrayList<Double> transactions = customer.getTransactions();
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println((j+1) + " Amount " + transactions.get(j));
                }
            }
        }
        return true;
    }

}
