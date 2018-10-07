package com.victor;

/**
 * Created by dev on 03.10.2018.
 */
public class Hamburger {

    private String name;
    private String rollType;
    private String meat;
    private double basePrice;

    private double additionsPrice = 0;
    private int availableAdditionsCount = 0;

    //constructor
    public Hamburger(String name, String rollType, String meat, double basePrice) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public Hamburger(double basePrice) {
        this("Basic", "type1", "meat", basePrice);
    }

    // add methods for Additions
    public void additions(String AdditionName, double AdditionPrice) {
        availableAdditionsCount++;
        if (availableAdditionsCount > this.getAvailableAdditions()) {
            System.out.println("Limit of available additions (" + this.getAvailableAdditions() +") has been exceeded");
        } else {
            this.additionsPrice += AdditionPrice;
            System.out.println("Added " + AdditionName + " with an extra price " + AdditionPrice);
        }
    }

    // getters
    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getTotalPrice() {
        return basePrice + additionsPrice;
    }

    public double getAdditionsPrice() {
        return this.additionsPrice;
    }
    public void getInfo() {
        System.out.println("Info: " + getClass().getSimpleName() + " burger with a " + this.getRollType() +
                " roll and " + this.getMeat() + ". Price is " + this.getBasePrice() + " Price of additions is " + this.getAdditionsPrice());
    }

    public int getAvailableAdditions() {
        return 4;
    }
}

