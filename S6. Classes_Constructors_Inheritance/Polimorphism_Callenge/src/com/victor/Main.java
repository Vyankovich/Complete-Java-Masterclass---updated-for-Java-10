package com.victor;

// create a base class called Car
// it should have a few fields that would be appropriate for a generic car class.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public Car() {
        this("Default", 4);


    }

    public String startEngine() {
        return "Car -> Engine started";
    }

    public String accelerate() {
        return "Car -> Acceleration started";
    }

    public String brake() {
        return "Car -> Braking started";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}
// SUB CLASSES

class SubCarFirst extends Car {
    public SubCarFirst() {
        super("firstCar", 2);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> Engine started";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> Acceleration started";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> Braking started";
    }
}

class SubCarSecond extends Car {
    public SubCarSecond() {
        super("secondCar", 3);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> Engine started";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> Acceleration started";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> Braking started";
    }
}

class SubCarThird extends Car {
    public SubCarThird() {
        super("thirdCar", 4);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> Engine started";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> Acceleration started";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> Braking started";
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.getName());
        System.out.println(car.getCylinders());
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("********");
        SubCarFirst sub1 = new SubCarFirst();
        System.out.println(sub1.startEngine());
        System.out.println(sub1.accelerate());
        System.out.println(sub1.brake());
        System.out.println("********");
        SubCarSecond sub2 = new SubCarSecond();
        System.out.println(sub2.startEngine());
        System.out.println(sub2.accelerate());
        System.out.println(sub2.brake());
        System.out.println("********");
        SubCarThird sub3 = new SubCarThird();
        System.out.println(sub3.startEngine());
        System.out.println(sub3.accelerate());
        System.out.println(sub3.brake());
        System.out.println("********");
    }
}
