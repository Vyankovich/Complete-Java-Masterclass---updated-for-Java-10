package com.victor;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dev on 10.11.2018.
 */
public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");// output previous value
        }
        System.out.println("=================================================");

        // remove
        if (languages.remove("Algol", "an algorithmic language")) {  // remove(key, value)
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }
        // replace
//        System.out.println(languages.replace("Lisp", "a functional programing language"));// output previous value
        if (languages.replace("Lisp", "therein lies madness", "a functional programing language")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

//        System.out.println(languages.replace("Scala", "this will not be added")); // null

        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
