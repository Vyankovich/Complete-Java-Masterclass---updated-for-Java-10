package com.victor;

/**
 * Created by dev on 03.10.2018.
 */
public class DeluxeBurger extends Hamburger {
    private int deluxeAdditionsCount = 0;

    public DeluxeBurger() {
        super("Deluxe", "special type3", "chicken", 15);
        super.additions("chips", 2);
        super.additions("drink", 3);
    }

    @Override
    public int getAvailableAdditions() {
        return 2;
    }


}

