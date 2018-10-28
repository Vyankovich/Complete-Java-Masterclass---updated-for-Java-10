package com.victor;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breath();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

    }
}
// abstract classes
// can have member variables  that are inherited, something that can not be done in interface
// not all methods in abstract class have to be abstract (without implementation)
// can have constructor, getters, setters
// methods can have any visibility (private, protected etc.)

// interface
// can have only public static final variables, e.g. constants.
// Because non-static variables require instance, and we can not instantiate interfaces
// all methods are abstract, however now they can have default implementation
// can not have constructors
// all methods over interface are automatically public. Methods can be private since java 9