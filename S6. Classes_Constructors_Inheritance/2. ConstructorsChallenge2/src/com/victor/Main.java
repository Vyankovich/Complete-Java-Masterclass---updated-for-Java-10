package com.victor;

public class Main {

    public static void main(String[] args) {

        VipCustomer someone = new VipCustomer();
        System.out.println(someone.getName() + " has credit limit of " + someone.getCreditLimit() + " Email: " + someone.getEmailAddress());

        VipCustomer victor = new VipCustomer("Victor", 10_000);
        System.out.println(victor.getName() + " has credit limit of " + victor.getCreditLimit() + " Email: " + victor.getEmailAddress());

        VipCustomer margo = new VipCustomer("Margo", 15_000.00, "margo@email.com");
        System.out.println(margo.getName() + " has credit limit of " + margo.getCreditLimit() + " Email: " + margo.getEmailAddress());
    }
}
