package com.victor;

/*
Write a method with the name sumDigits that has one int parameter called number.
If parameter is >= 10 then the method should process the number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
*/
public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(7));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(15));

    }

    private static int sumDigits(int number) {
        if (number >= 10) {
            int sum = 0;
            while (number > 0) {
                // extract the least-significant digit
                int digit = number % 10;
                // drop the least-significant digit
                number /= 10;
                sum += digit;
            }
            return sum;
        } else {
            return -1;
        }
    }
}
