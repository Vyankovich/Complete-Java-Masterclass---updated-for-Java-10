package com.victor;

public class Main {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));

    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer && (temperature > 24 && temperature < 46)){
            return true;
        } else {
            return temperature > 24 && temperature < 36;
        }
    }
}
