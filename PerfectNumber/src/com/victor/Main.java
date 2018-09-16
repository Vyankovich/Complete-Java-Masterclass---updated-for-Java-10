package com.victor;

public class Main {

    public static void main(String[] args) {


        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    private static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            int sumOfReminders = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sumOfReminders += i;
                }
            }
            return (number == sumOfReminders);
        }
    }
}
