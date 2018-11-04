package com.victor;



public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("T1", 8, 12);
//        theatre.getSeats();

        if (theatre.reserveSeat("A09")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken or not exist");
        }

        if (theatre.reserveSeat("A09")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken or not exist");
        }

    }
}
