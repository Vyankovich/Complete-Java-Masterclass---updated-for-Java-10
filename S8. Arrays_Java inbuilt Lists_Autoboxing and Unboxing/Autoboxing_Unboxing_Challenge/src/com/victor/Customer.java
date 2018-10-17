package com.victor;

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
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
