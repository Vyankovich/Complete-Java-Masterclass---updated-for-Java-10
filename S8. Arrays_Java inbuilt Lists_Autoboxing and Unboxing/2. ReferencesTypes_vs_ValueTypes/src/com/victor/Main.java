package com.victor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

// when we create a variable a single space in memory is allocated to store that value
// and that variable directly holds a value.
// if we assign it to another variable the value is copied directly and then both variables work independently
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("AnotherIntValue = " + anotherIntValue);

        anotherIntValue++;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("AnotherIntValue = " + anotherIntValue);

// Arrays are reference type. Reference (variable) holds address to the object in a memory but not the object itself
        int[] myIntArray = new int[5]; // variable myIntArray is a reference
        int[] anotherArray = myIntArray; //now we have 2 references pointing to the same array in a memory
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("After change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After change anotherArray = " + Arrays.toString(anotherArray));

        // now anotherArray points to different array in a memory
        anotherArray = new int[]{1, 2, 3, 4, 5};
        System.out.println("After dereference anotherArray = " + Arrays.toString(anotherArray));

    }
}
