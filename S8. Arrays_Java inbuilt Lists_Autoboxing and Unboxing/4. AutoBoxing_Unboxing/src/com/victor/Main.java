package com.victor;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

// if we want to create a collection of primitive types, we don't allowed to it strictly
    // we have to convert (wrap it up) to object type
        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(i); // autoboxing. compiled to Integer.valueOf(i)
            //we converting the primitive type to the object wrapper, to the object
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " -> " + intArrayList.get(i)); // unboxing, compiled to intArrayList.get(i).intValue()
            // we converting it back from the object wrapper to primitive type
        }

        Integer myIntValue = 56; //  converted to Integer.valueOf(56);
        int myInt = myIntValue; // myIntValue.intValue();


        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl); // autoboxing // Double.valueOf(dbl);
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i); // unboxing // myDoubleValues.get(i).doubleValue()
        }









    }
}
