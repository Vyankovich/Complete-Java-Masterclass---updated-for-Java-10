package com.victor;

public class Main {

    public static void main(String[] args) {

        char myChar = '\u00A9'; // width 2 bytes
        System.out.println("Unicode output: " + myChar);

        boolean myBoolean = true;
        System.out.println(myBoolean);

        char myRegSymbol = '\u00AE';
        System.out.println("Unicode output: " + myRegSymbol);

    }
}
