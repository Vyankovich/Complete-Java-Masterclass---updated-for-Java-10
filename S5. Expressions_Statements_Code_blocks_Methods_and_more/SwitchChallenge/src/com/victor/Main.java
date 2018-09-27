package com.victor;

public class Main {

    public static void main(String[] args) {

/*        int switchValue = 3;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Value was not 1,2,3,4 or 5");
                break;
        }*/

        char charValue = 'D';
        switch (charValue) {
            case 'A':
                System.out.println("char A found");
                break;

            case 'B':
                System.out.println("char B found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;

            default:
                System.out.println("char NOT found");
                break;
        }

        String month = "JANUARy";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;

            case"june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not found");
        }

    }


}
