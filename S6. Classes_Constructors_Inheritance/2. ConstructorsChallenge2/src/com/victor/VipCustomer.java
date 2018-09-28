package com.victor;

/*
Challenge 2
create a new class VipCustomer
it should have 3 fields: name, credit limit, email address
create 3 constructors
1st constructor empty should call the constructor with 3 parameters with default values
2nd constructor should pass on the 2 values it receives and add a default value dor the 3rd
3rd constructor should save all fields.
create getters only dor this using code generation of IntelliJ as setters won't be needed
test and confirm it works.
*/
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        // default constructor invokes constructor with parameters
        this("default name", 0.00, "default@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default@email.com");
    }

    // Do all the initialization in one constructor and the other constructors just call that major constructor. Good way of doing things.
// So you don't duplicate code (initialization) in more than one place.
    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
