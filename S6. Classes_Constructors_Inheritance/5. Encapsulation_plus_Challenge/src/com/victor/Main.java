package com.victor;
/*
* Encapsulation - mechanism that allows you to restrict
* access to certain components in the object that you are creating.
* */
public class Main {

    public static void main(String[] args) {
/*
//wrong way of doing things without encapsulation
        Player player = new Player();
        player.name = "Victor";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.health = 200; // direct access to field
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
*/
/*        EnhancedPlayer player = new EnhancedPlayer("Victor",50,"Sword");
        System.out.println("Initial health is " + player.getHitPoints());*/

/*
Challenge time
create a class and demonstrate proper encapsulation techniques
the class will be called Printer
It should have fields for the toner Level, number of pages printed, and
also whether its a duplex printer (capable of printing on both sides of the paper).
Add method to fill up toner (up to max of 100%), another method to
simulate printing a page (which should increase the number of pages printed).
Decide on the scope, whether to use constructors, and anything else you think is needed.
*/
        Printer printer = new Printer(0,true);
        System.out.println(printer.getPagesPrinted());
        printer.fillUpToner(40);
        printer.printing(50,true);


    }
}
