package com.victor;

// inheritance
// you can create sub-classes on a basis of super-class
// subclass can use methods and some variables (common characteristics) from super class

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // we need to initialize characteristics
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {

        //execute constructor from Animal class and those fields have been initialized
        super(name, 1, 1, size, weight);
        // initialization for fields of Dog class
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        // good practice to call move() instead super.move() because in case of overriding of super.move() method
        // it's gonna correctly call that move() method.
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("moveLegs() called");
    }

    // do not confuse override and overload
// overloading - one name, but different parameters
// override - one name, input output types, different result
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
