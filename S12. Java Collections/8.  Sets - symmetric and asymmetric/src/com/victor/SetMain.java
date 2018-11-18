package com.victor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dev on 17.11.2018.
 */
public class SetMain {

    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There're " + squares.size() + " squares and " + cubes.size() + " cubes.");

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements.");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");
        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one dae in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));        // asList()

        for (String s : words) {
            System.out.println(s);
        }
        System.out.println("===========================");
// s1.addAll(s2) — transforms s1 into the union of s1 and s2.
// (The union of two sets is the set containing all of the elements contained in either set.)
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        String[] natureWords = {"all","nature","is","but","art","unknown","to","tree"};
        nature.addAll(Arrays.asList(natureWords));
        printSet(nature);
        String[] divineWords = {"to","err","is","human","to","forgive","divine"};
        divine.addAll(Arrays.asList(divineWords));
        printSet(divine);
        System.out.println("=========== diff ================");
// s1.removeAll(s2) — transforms s1 into the (asymmetric) set difference of s1 and s2.
// (For example, the set difference of s1 minus s2 is the set containing all of the elements found in s1 but not in s2.)
        System.out.println("nature - divine:");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);
// s1.retainAll(s2) — transforms s1 into the intersection of s1 and s2.
// (The intersection of two sets is the set containing only the elements common to both sets.)
        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);
        System.out.println("===========================");
        System.out.println("Symmetric difference");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);
        System.out.println("===========================");
        if (nature.containsAll(divine)) {
            System.out.println("divine is a subset of nature");
        }
        if (nature.containsAll(intersectionTest)){
            System.out.println("intersection is a subset of nature");
        }
        if (divine.containsAll(intersectionTest)) {
            System.out.println("intersection is a subset of divine");
        }



    }

    private static void printSet(Set<String> set) {
        System.out.println("\t");
        for(String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
