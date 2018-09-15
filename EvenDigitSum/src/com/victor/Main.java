package com.victor;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(13579));
        System.out.println(getEvenDigitSum(-22));

    }
// return sum of even digits within the number. If the number is negative the method should return -1.
    private static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sumEven = 0;
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                if (digit % 2 == 0) {
                    sumEven += digit;
                }
            }
            return sumEven;
        }
    }

}
