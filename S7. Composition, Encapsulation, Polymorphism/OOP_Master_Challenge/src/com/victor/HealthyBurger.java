package com.victor;

/**
 * Created by dev on 03.10.2018.
 */
public class HealthyBurger extends Hamburger {
    private int healthyAdditionsCount = 0;

    public HealthyBurger(double basePrice) {
        super("Healthy", "Brown rye bread", "Healthy meat", basePrice);
    }

    @Override
    public int getAvailableAdditions() {
        return 6;
    }
}
