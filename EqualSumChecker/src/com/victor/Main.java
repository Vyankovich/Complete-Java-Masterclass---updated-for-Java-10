package com.victor;

public class Main {

    public static void main(String[] args) {

        hasEqualSum(1,1,1);
        hasEqualSum(1,1,2);
        hasEqualSum(1,-1,0);
    }

    public static boolean hasEqualSum(int firstParam, int secondParam, int thirdParam){
        return (firstParam + secondParam == thirdParam);
    }

}
