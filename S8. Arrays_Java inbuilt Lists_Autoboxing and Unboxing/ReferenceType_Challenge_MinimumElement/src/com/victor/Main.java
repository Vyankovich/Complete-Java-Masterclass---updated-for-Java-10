package com.victor;

import java.util.Scanner;

public class Main {
    // write a method called readIntegers() with parameter called count
// (how many integers the user needs to enter)
// the method needs to read from the console until all the numbers are entered,
// and then return an array containing the numbers entered.
// Write a method findMin() with array as a parameter. Method needs to return the minimum value in the array.
// In the main() method read the count from the console and call the method
// readIntegers() with the count parameter.
// then call the findMin() method passing the array returned from the call to the
// readIntegers() method.
// Finally, print the minimum element in the array.
// Tips:
// assume that user will only enter numbers, never letters
// create Scanner as a static field
//
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a number from 1 to 5:\r");
        int count = scanner.nextInt();
        System.out.println("Minimum number in a given array is: " + findMin(readIntegers(count)));

    }

    // method to return an array from user input
    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " integer numbers:\r");
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // method to find min in a given array
    public static int findMin(int[] array) {
        //int[] arr = Arrays.copyOf(array, array.length);
        int min = array[0]; // or int min = Integer.MAX_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


}
