package com.victor;

/**
 * Created by dev on 17.11.2018.
 */
public class dogMain {
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");
// if we have equals() overwritten then we get results as
        System.out.println(rover2.equals(rover)); // true, because Labrador is an instance of Dog
        System.out.println(rover.equals(rover2)); // false, Dog isn't an instance of Labrador
    }
}
