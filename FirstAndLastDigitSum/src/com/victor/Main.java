package com.victor;

public class Main {

    public static void main(String[] args) {

        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);

    }

    /*
    Find the first and last digit of the parameter number and return sum of them.
    If number is negative then return -1
    */
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int lastDigit = number % 10;
            int firstDigit = 0;
            while (number > 0) {
                firstDigit = number % 10;
                number /= 10;
            }

            return lastDigit + firstDigit;
        }
    }
}
