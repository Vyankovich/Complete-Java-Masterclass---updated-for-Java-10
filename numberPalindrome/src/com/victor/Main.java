package com.victor;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(101));
    }
// Check a palindrome number.
// find the reverse of the given number. Compare the number with reverse.

    private static boolean isPalindrome(int number) {
        if (number >= 10 || number <= -10) {

            int initialNumber = number;
            int reverseNumber = 0;

            while (number != 0) {
                reverseNumber *= 10;
                int digit = number % 10;
                number /= 10;
                reverseNumber += digit;
            }
            return reverseNumber == initialNumber;

        } else {
            return false;
        }
    }
}
