package Interfaces;

/**
 * Created by dev on 22.10.2018.
 */
public class Person implements Info{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    private void sayHello() {
        System.out.println("Hello!");
    }

    @Override
    public void showInfo() {
        System.out.println("Person name is: " + this.getName());
        sayHello();
    }
}
