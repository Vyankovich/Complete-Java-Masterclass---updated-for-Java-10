package com.victor;

public class Main {

    public static void main(String[] args) {


        hasSameLastDigit(10,11,81);
        hasSameLastDigit(41,22,71);
        hasSameLastDigit(23,32,42);
        hasSameLastDigit(9,99,999);

    }
// Return true if at least two of the numbers share the same rightmost digit, otherwise it should return false.
    public static boolean hasSameLastDigit (int first, int second, int third) {
        if (!((first >= 10 && first <= 1000) && (second >= 10 && second <= 1000) && (third >= 10 && third <= 1000))) {
            return false;
        } else {
            int rightDigitFirst = first % 10;
            int rightDigitSecond = second % 10;
            int rightDigitThird = third % 10;
            return ((rightDigitFirst == rightDigitSecond) || (rightDigitFirst == rightDigitThird) || (rightDigitSecond == rightDigitThird));
        }
    }
}
