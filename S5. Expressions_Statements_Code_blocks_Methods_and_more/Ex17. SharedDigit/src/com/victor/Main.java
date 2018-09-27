package com.victor;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 43));

    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (!((firstNumber >= 10 && firstNumber <= 99) && (secondNumber >= 10 && secondNumber <= 99))) {
            return false;
        } else {
            int leastOfFirst = firstNumber % 10;
            int firstOfFirst = firstNumber / 10;
            int leastOfSecond = secondNumber % 10;
            int firstOfSecond = secondNumber / 10;
            return (firstOfFirst == firstOfSecond) || (firstOfFirst == leastOfSecond) || (leastOfFirst == firstOfSecond) || (leastOfFirst == leastOfSecond);

        }
    }
}
