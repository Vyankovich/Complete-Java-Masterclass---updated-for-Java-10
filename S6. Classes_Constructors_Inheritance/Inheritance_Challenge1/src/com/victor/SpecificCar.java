package com.victor;

/*
 * Challenge
 * Start with base class of a Vehicle, then create a Car class that inherits from this base class.
 * Finally, create another class, a specific type of Car that inherits from the Car class.
 * You should be able to hand steering, changing gears, and moving (speed in other words).
 * You will want to decide where to put the appropriate state and behaviors (fields and methods).
 * As mentioned above, changing gears, increasing/decreasing speed should be included.
 * For specific type of vehicle you will want to add something specific for that type of car.
 */
final class SpecificCar extends Car {
    private int wings;

    public SpecificCar() {
        super("Tesla", 10, 7, 4, "s3", 5);
        this.wings = 2;
    }

    private void fly() {
        System.out.println("SpecificCar.fly() called.");
    }

    @Override
    public void moving(int speed) {
        fly();
        super.moving(speed);
    }
}
