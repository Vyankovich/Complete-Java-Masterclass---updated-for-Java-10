package com.victor;

public class Main {

    public static void main(String[] args) {

/*        System.out.println(isEvenNumber(5));
        System.out.println(isEvenNumber(4));
        System.out.println(isEvenNumber(0));
        System.out.println(isEvenNumber(-1));
        System.out.println(isEvenNumber(-2));*/
        System.out.println("******************");

        int number = 4;
        int finishNumber = 20;
        int sumEven = 0;
        int counter = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue; // both Break and Continue have the effect of interrupting the code,
                // so in case of Continue we won't do any code any further down but go back to the start of the loop instead
            }
            sumEven += number;
            counter++;
            System.out.println("Even number " + number);

            if (counter == 5) {
                break;
            }
        }
        System.out.println("Sum of even numbers = " + sumEven);

    }

    private static boolean isEvenNumber(int number) {
        return ((number % 2) == 0);
    }
}
