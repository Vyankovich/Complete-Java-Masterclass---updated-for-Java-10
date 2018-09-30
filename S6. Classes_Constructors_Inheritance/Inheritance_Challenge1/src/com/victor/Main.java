package com.victor;

public class Main {

    public static void main(String[] args) {
        /* 29.09.2018
         * Challenge
         * Start with base class of a Vehicle, then create a Car class that inherits from this base class.
         * Finally, create another class, a specific type of Car that inherits from the Car class.
         * You should be able to hand steering, changing gears, and moving (speed in other words).
         * You will want to decide where to put the appropriate state and behaviors (fields and methods).
         * As mentioned above, changing gears, increasing/decreasing speed should be included.
         * For specific type of vehicle you will want to add something specific for that type of car.
         */
/*    System.out.println("******************");
    Vehicle defaultVehicle = new Vehicle();
    System.out.println(defaultVehicle.getName());

    System.out.println("******************");

    Vehicle wagon = new Vehicle("Wagon",3,2);
    System.out.println(wagon.getName());*/
/*    System.out.println("******************");
    Car defaultCar = new Car();
    System.out.println(defaultCar.getName());
    System.out.println(defaultCar.getSize());
    System.out.println(defaultCar.getModel());
    System.out.println(defaultCar.getDoors());*/
        System.out.println("******************");
        SpecificCar tesla = new SpecificCar();
        tesla.moving(100);
        System.out.println("******************");
        System.out.println("******************");
        System.out.println("******************");


    }

}
