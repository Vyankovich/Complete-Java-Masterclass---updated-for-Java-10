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
public class Vehicle {
    private String name;
    private int size;
    private int weight;

    // constructors - methods we call when creating objects to construct (initialize) objects
    public Vehicle(String name, int size, int weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        System.out.println("Vehicle constructor with parameters called");
    }

    public Vehicle() {
        // we can call major constructor in order to perform default initialisation
        this("Default vehicle name", 1, 1);
        System.out.println("Vehicle default constructor called");
    }

    public void moving(int speed) {
        System.out.println("Vehicle moving() called. Speed: " + speed);
    }

    // getters
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
