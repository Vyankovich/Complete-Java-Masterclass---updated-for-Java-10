package Interfaces;

/**
 * Created by dev on 22.10.2018.
 */
public class Animal implements Info{
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    private int getId() {
        return id;
    }

    private void sleep() {
        System.out.println("I am sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("Animal id is: " + this.getId());
        sleep();
    }
}
