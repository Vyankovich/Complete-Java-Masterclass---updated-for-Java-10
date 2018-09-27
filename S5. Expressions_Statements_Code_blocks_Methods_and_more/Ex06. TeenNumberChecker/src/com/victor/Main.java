package com.victor;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean hasTeen (int firstParam, int secondParam, int thirdParam){
        return ((firstParam >= 13 && firstParam <= 19) || (secondParam >= 13 && secondParam <= 19) || (thirdParam >= 13 && thirdParam <= 19));
    }

}
