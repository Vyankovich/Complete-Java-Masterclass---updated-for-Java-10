package com.victor;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
                if (count == 10) {
                    System.out.println("break");
                    break;
                }
            }
        }

    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
