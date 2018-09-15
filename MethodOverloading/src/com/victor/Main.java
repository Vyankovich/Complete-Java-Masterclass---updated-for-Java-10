package com.victor;

public class Main {

    public static void main(String[] args) {

/*	    int newScore = calculateScore("Victor", 500);
        System.out.println("New score is " + newScore);*/

        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if(centimeters< 0.0){
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeters(157);

    }

/*    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }*/

    private static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (!(feet >= 0 || (inches >= 0 || inches <= 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        } else {
            double centimeters = (feet * 12) * 2.54d; // sm in feet
            centimeters += inches * 2.54d; // sm in N feet
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " centimeters");
            return centimeters;
        }
    }

    private static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }


}
