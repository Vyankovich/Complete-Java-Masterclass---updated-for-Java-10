package com.victor;

public class Main {

    public static void main(String[] args) {


        // the purpose of the application is to help a fictitious company called Bills Burger to manage
        // their process of selling hamburgers.
        // Our application will help Bill to select types of burgers, some of the additional items (additions) to
        // be added to the burgers and pricing.
        // we want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
        // the basic hamburger should have the following items.
        // Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc.) that
        // the customer can select to be added to the burger.
        // Each one of these items gets charged an additional price so you need some way to track how many items got added
        // and to calculate the final price ( base burger with all the additions).
        // This burger has a base price and the additions are all  separately priced (up to 4 additions, see above).
        // Create a Hamburger class to deal with all the above.
        // The constructor should only include  the roll type, meat and price, can also include name of burger or you
        // can use a setter.
        // Also create two extra varieties of Hamburgers ( subclasses) to cater for
        // a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
        // The healthy burger van have 6 items (Additions) in total.
        // Hint: you probably want to process the two additional items in this class (subclass of Hamburger),
        // not the base class (Hamburger), since the two additions are only appropriate dor this new class
        // (in other words new  burger type).
        // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
        // hint: you have to find a way to automatically add these new additions at the time the deluxe burger
        // object is created, and then prevent other additions being made.
        // All 3 classes should have a method that can be called anytime to show the base price of the hamburger
        // plus all additional, each showing the addition name, and addition price, and a grand/final total for the
        // burger (base price + all additions)
        // For the two additional classes this may require you to be looking at the base class for pricing and then
        // adding totals to final price.

        Hamburger burger = new Hamburger(3.1);
        burger.additions("addOne",1);
        burger.additions("addTwo",1);
        burger.additions("addThree",1);
        burger.getInfo();
        burger.additions("addFour",1);
        burger.additions("addFive",1);
        System.out.println("Total price is: " + burger.getTotalPrice() + " Additions price is: " + burger.getAdditionsPrice());

        System.out.println("********************");

        DeluxeBurger deluxe = new DeluxeBurger();
        deluxe.getInfo();
        deluxe.additions("something", 1);

        System.out.println("********************");

        HealthyBurger healthy = new HealthyBurger(4);
        healthy.getInfo();
        healthy.additions("addOne",1);
        healthy.additions("addTwo",1);
        healthy.additions("addThree",1);
        healthy.getInfo();
        healthy.additions("addFour",1);
        healthy.additions("addFive",1);
        healthy.additions("addSix",1);
        healthy.additions("addSeven",1);

    }
}
