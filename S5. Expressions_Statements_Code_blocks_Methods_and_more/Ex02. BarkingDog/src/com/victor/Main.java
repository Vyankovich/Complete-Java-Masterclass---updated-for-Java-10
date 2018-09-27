package com.victor;

public class Main {

    public static void main(String[] args) {

	    bark(true, 1);
	    bark(false, 2);
	    bark(true, 8);
	    bark(true, -1);
	    bark(true, 4);
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if ((hourOfDay < 0) || (hourOfDay > 23)) {
            return false;
        } else {
            return (barking) && ((hourOfDay < 8) || (hourOfDay > 22));
        }
    }
}
