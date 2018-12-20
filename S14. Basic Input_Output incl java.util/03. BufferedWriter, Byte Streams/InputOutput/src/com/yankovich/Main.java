package com.yankovich;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();

    public static void main(String[] args) {
        // Change the program to allow players to type full words, or phrases, then move to the
        // correct location based upon their input.
        // The player should be able to type commands such as "Go West", "run South", or just "East"
        // and the program will move to the appropriate location if  there is one. As at present, an
        // attempt to move in an invalid direction should print a message and remain in the same place.
        // Single letters commands (N, W, S, E, Q) should still be available

        Scanner scanner = new Scanner(System.in);

        Map<String, String> directions = new HashMap<>();
        directions.put("SOUTH", "S");
        directions.put("NORTH", "N");
        directions.put("EAST", "E");
        directions.put("WEST", "W");
        directions.put("QUIT", "Q");

//        for (Integer key : locations.keySet()) {
//            System.out.println(key + " " + locations.get(key).getDescription() + ". || Available exits are " + locations.get(key).getExits());
//        }

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit: exits.keySet()) {
                System.out.print(exit + " ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word : words) {
                    boolean dir = false;
                    if (directions.containsKey(word)) {
                        direction = directions.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You can not go in that direction");
            }
        }
//        String[] road = "You are standing at the end of a road before a small brick building".split(" ");
//        for (String i :road) {
//            System.out.println(i);
//        }
//        System.out.println("============================");
//        String[] building = "You are inside a building, a well house for a small spring".split(", ");
//        for (String i : building) {
//            System.out.println(i);
//        }
    }
}
