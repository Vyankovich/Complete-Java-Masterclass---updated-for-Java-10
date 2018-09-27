package com.victor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean errFlag = false;
        boolean isIntAppeared = false;

        while(!errFlag) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if (!isIntAppeared) {
                    isIntAppeared = true;
                    min = number;
                    max = number;
                }

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            } else {
                System.out.println("Invalid Number");
                errFlag = true;
            }
            scanner.nextLine(); // handle input
        }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        scanner.close();
    }
}