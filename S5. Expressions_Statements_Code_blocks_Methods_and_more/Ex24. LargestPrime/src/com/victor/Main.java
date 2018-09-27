package com.victor;

public class Main {

    public static void main(String[] args) {


        System.out.println(getLargestPrime(45));
        //System.out.println(getLargestPrime(7));
    }

// prime number - is greater than 1
// and cannot be written as a product of two natural numbers that are both smaller than it.
// Calculate the largest prime number in a given parameter and return it.

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int maxPrime = 2;

        for (int i = 2; i <= number; i++) {
// find divisor for given number
            if (number % i == 0) {
// if found then check is this number prime or not
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
// write current prime to variable;
                if (isPrime) {
                    maxPrime = i;
                }
            }
        }
        return maxPrime;
    }

}
