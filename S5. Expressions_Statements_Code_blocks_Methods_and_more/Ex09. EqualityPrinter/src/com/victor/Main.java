package com.victor;

public class Main {

    public static void main(String[] args) {

     printEqual(1,1,1);
     printEqual(1,2,1);
     printEqual(1,1,2);
     printEqual(2,1,2);

    }

    public static void printEqual(int first,int second, int third){
        if (first < 0 || second < 0 || third < 0){
            System.out.println("Invalid Value");
        } else {
            if(first == second && second == third){
                System.out.println("All numbers are equal");
            } else if (first != second && second != third && first != third){
                System.out.println("All numbers are different");
            } else{
                System.out.println("Neither all are equal or different");
            }
        }
    }
}
