package com.yankovich;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

// Ch.1 write the anonymous class as a lambda

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String myString = "Let's split this up into an array";
//                String[] parts = myString.split(" ");
//                for (String part : parts) {
//                    System.out.println(part);
//                }
//            }
//        };

        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        // ch. 2
        Function<String, String> challenge2 = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }

            return returnVal.toString();
        };
// challenge 3. Execute the function
        System.out.println(challenge2.apply("1234567890"));

// challenge 5, print the result from method (ch.4)
        String output = everySecondCharacter(challenge2,"1234567890");
        System.out.println(output);

// challenge 6,7 write supplier and print
        Supplier<String> iLoveJava = () -> "I love Java";
        System.out.println(iLoveJava.get());

// challenge9. Modify the list to have the first letters in uppercase and print the list.
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

//        List<String> firstLetterInUpperCase = new ArrayList<>();
//        topNames2015.forEach(name -> firstLetterInUpperCase.add(name.substring(0,1).toUpperCase() +
//                                                                name.substring(1)));

        topNames2015
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .sorted()
                .forEach(System.out::println);

        long namesBeginningWithA = topNames2015
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
//                .peek(System.out::println)
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println("Names beginning with A : " + namesBeginningWithA);

        topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());




    }
// Challenge 2 write the method as a lambda
//    public static String everySecondChar(String source) {
//        StringBuilder returnVal = new StringBuilder();
//        for (int i = 0; i < source.length(); i++) {
//            if (i % 2 == 1) {
//                returnVal.append(source.charAt(i));
//            }
//        }
//
//        return returnVal.toString();
//    }

// Challenge 4. Write a method that accept a function as a parameter and executes it
    static String everySecondCharacter(Function<String, String> function, String argument) {
        return function.apply(argument);
    }


}
