package com.victor;

public class Main {

    public static void main(String[] args) {

/*        System.out.println(isOdd(1));
        System.out.println(isOdd(2));
        System.out.println(isOdd(3));*/

/*        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        System.out.println(sumOdd(10, 5));*/
        System.out.println("************************");
        System.out.println(sumOdd(10, 5));

    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        //System.out.print(number + " - isOdd - ");
        return (number % 2 != 0);
    }

    public static int sumOdd(int start, int end) {
        if (!((start > 0 && end > 0) && start <= end)) {
            return -1;
        } else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    }
}
