package com.victor;

import java.util.PrimitiveIterator;

public class Main {

    public static void main(String[] args) {

        printFactors(6); // should print 1 2 3 6
        printFactors(32); // should print 1 2 4 8 16 32
        printFactors(10); // 1 2 5 10
        printFactors(-1); // should print "Invalid Value" since number is < 1
    }

    // print all factors of the number.
    // Example: 3 is factor of 6 ,,because 3 fully divides 6 without living a reminder.

    private static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
