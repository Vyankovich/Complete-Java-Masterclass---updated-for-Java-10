package Interfaces;

/**
 * Created by dev on 22.10.2018.
 */
public class Test {
    public static void main(String[] args) {
        Info animal = new Animal(1);
        Info person = new Person("Victor");

        animal.showInfo();
        person.showInfo();
    }
}
