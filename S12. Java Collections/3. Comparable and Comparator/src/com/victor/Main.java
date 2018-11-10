package com.victor;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**     Collections List Methods
*/
public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("T1", 8, 12);

        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if (theatre.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList <>(theatre.getSeats()); // shallow copy done
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        System.out.println("**/**/**/**/**/");
        Collections.sort(priceSeats,Theatre.PRICE_ORDER);
        printList(priceSeats);





    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat  seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        } // alternative
/*        for (int i = 0; i < list.size(); i++) {
            Theatre.Seat seat = list.get(i);
            System.out.print(" " + seat.getSeatNumber());
        }*/
        System.out.println();
        System.out.println("=============================");
    }

}
