package com.victor;

/**
 * Created by dev on 27.10.2018.
 */
public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breath() {
        System.out.println("Breath in, breath out, repeat");
    }

}
