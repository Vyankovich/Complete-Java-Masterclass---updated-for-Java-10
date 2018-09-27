package com.victor;

public class Main {

    public static double PI = 3.14159d;

    public static void main(String[] args) {

        System.out.println(area(50));
        System.out.println(area(14,14));

    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * PI;
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1;
        }
        return x * y;
    }

}
