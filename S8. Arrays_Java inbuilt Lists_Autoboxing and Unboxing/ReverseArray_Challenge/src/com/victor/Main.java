package com.victor;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // write a method called reverse() with an int array as a parameter.
    // the method should not return any value. In other words, the method is allowed to modify the array parameter.
    // In main() test the reverse() method and print the array both reversed and non-reversed.
    // To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
    // For example, if the array is {1,2,3,4,5}, then the reversed array is {5,4,3,2,1}.

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //int[] array1 = {1,2,3,4,5,6,7};
        //System.out.println(Arrays.toString(array1));

        System.out.println("Enter length of array:\r");
        int count = scanner.nextInt();

        int[] array = getArray(count);
        System.out.println(Arrays.toString(array));

        reverse(array);
        System.out.println(Arrays.toString(array));

    }

    private static int[] getArray(int count) {

        int validInput = 0;
        int i = 0;
        int[] array = new int[count];

        System.out.println("Please, enter " + count + " integer numbers.");

        while (count > 0) {
            int order = validInput + 1;
            System.out.println("Enter number #" + order + ":");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                array[i] = number;
                count--;
                i++;
                validInput++;
            } else {
                System.out.println("Invalid input");
            }
            scanner.nextLine();
        }
        scanner.close();

        return array;
    }

    /*    public static void reverse(int[] array) {
            int[] reversedArray = Arrays.copyOf(array, array.length);
            for (int i = 0; i < array.length; i++) {
                reversedArray[(array.length-1) - i] = array[i];
            }
            System.arraycopy(reversedArray, 0, array, 0, array.length);
        }*/
    public static void reverse(int[] array) {
        int middle = array.length / 2;
        int maxIndex = array.length - 1;
        for (int i = 0; i < middle; i++) {
            int temp = array[maxIndex - i];
            array[maxIndex - i] = array[i];
            array[i] = temp;
        }
    }

}
