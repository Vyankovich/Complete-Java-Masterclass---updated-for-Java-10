package com.victor;

public class Main {

    public static void main(String[] args) {

        Car porshe = new Car();
        Car holden = new Car();
        //System.out.println("Model is " + porshe.getModel());
        porshe.setModel("911");
        System.out.println("Model is " + porshe.getModel());
    }
}
