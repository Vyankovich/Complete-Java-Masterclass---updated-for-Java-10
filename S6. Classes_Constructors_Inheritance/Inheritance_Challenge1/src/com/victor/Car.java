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
public class Car extends Vehicle {
    private int wheels;
    private String model;
    private int doors;

    // constructor
    // initialization of fields
    public Car(String name, int size, int weight, int wheels, String model, int doors) {
        super(name, size, weight); // constructor from super class
        this.wheels = wheels;
        this.model = model;
        this.doors = doors;
    }

    public Car() {
        this.wheels = 4;
        this.model = "Unknown car model";
        this.doors = 5;
    }

    // methods
    private void handSteering() {
        System.out.println("handSteering() called.");
    }

    private void changingGears() {
        System.out.println("Car changingGears() called.");
    }

    @Override
    public void moving(int speed) {
        System.out.println("Car.moving() called.");
        changingGears();
        handSteering();
        super.moving(speed);  // method from super class
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }
}
