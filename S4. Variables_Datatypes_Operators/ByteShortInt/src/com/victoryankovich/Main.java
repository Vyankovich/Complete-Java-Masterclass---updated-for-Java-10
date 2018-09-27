package com.victoryankovich;

public class Main {

    public static void main(String[] args) {

/*        //byte has a width of 8
        byte myMaxByteNumber = 127;
        byte myMinByteNumber = -128;*/

/*        // short has a width of 16
        short myMinShortNumber = -32768;
        short myMaxShortNumber = 32767;
        short myShortTotal = (short) (myMinShortNumber / 2); // expressions are integers in JAVA by default that's why we need casting*/

/*        //  int has a width of 32
        int myMaxIntValue = 2_147_483_647;
        int myMinIntValue = -2_147_483_648;
        int myIntTotal = (myMinIntValue / 2);*/

/*        // long has a width of 64
        long myLongMaxValue = 9_223_372_036_854_775_807L;*/

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long LongTotal = 50000L + 10L * (byteValue + shortValue + intValue); // long type accepts int values
//      short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));

        System.out.println("MyTotal = " + LongTotal);

    }
}

