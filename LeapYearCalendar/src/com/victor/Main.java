package com.victor;

public class Main {

    public static void main(String[] args) {

        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        isLeapYear(1924);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        }

        return false;
    }
}
