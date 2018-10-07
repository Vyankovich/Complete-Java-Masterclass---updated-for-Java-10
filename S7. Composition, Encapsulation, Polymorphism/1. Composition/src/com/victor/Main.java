package com.victor;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);


        //Resolution nativeResolution = new Resolution(2540, 1440);
        // if you don't need to create a variable, you are not going to use it for  anything else, you only want to pass it to a method, then you can type like this
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp();

        // create a single room of a house using composition.
        // think about the things that should be included in the room.
        // may be physical parts of the house but furniture as well
        // add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.

        System.out.println("**********");
        Room room = new Room(new Wall(10,15,1), new Ceiling(3),new Lamp("white"), new Sofa("model-3",500));
        room.lightON();
        System.out.println("**********");
        room.getLamp().turnOnLight();
    }
}
