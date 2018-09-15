package com.victor;

public class Main {

    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
        return (int) (firstNum * 1000) == (int) (secondNum * 1000);
    }

}
/*Method should return boolean and it needs to return true
if two double numbers are the same up to three decimal places. Otherwise return false.*/
