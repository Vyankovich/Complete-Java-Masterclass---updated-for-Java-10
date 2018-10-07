package com.victor;
// create a single room of a house using composition.
// think about the things that should be included in the room.
// may be physical parts of the house but furniture as well
// add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.
public class Room {
    private Wall wall;
    private Ceiling ceiling;
    private Lamp lamp;
    private Sofa sofa;

    public Room(Wall wall, Ceiling ceiling, Lamp lamp, Sofa sofa) {
        this.wall = wall;
        this.ceiling = ceiling;
        this.lamp = lamp;
        this.sofa = sofa;
    }

    public void lightON(){
        lamp.turnOnLight();
    }

    public Lamp getLamp() {
        System.out.println("Room.getLamp()");
        return lamp;
    }
}
