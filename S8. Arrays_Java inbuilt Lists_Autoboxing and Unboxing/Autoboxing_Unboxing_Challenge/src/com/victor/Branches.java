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
public class Branches {
    private String name;
    private ArrayList<Customer> customers;

    public Branches(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer (String customerName, double initialAmount) {
        if (findCustomer(customerName) != null) {
            System.out.println("Error of adding new customer");
            return false;
        }
        this.customers.add(new Customer(customerName,initialAmount));
        return true;
    }

    public boolean addTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer == null) {
            System.out.println("Error of adding new transaction");
            return false;
        }
        existingCustomer.addTransaction(amount);
        return true;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
