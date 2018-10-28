package com.victor;

/**
 * Created by dev on 27.10.2018.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breath();

    public String getName() {
        return name;
    }
}
// not all the methods have to be abstract
// and we can add fields, regular methods like constructors, getters
// this is one of the difference between abstract class and interfaces