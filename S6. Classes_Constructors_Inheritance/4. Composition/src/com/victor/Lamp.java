package com.victor;

public class Lamp {
    private String color;

    public Lamp(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void turnOnLight(){
        System.out.println("Lamp.turnOnLight()");
    }
}
