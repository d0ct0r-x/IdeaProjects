package com.tomlloyd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Locations locations = new Locations();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int loc = 64;
//        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for(String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String[] input = scanner.nextLine().toUpperCase().split(" ");
            int match = 0;
            String direction = "";
            for (String word : input) {
                switch(word) {
                    case "N": case "NORTH":
                        direction = "N";
                        match++;
                        break;
                    case "W": case "WEST":
                        direction = "W";
                        match++;
                        break;
                    case "E": case "EAST":
                        direction = "E";
                        match++;
                        break;
                    case "S": case "SOUTH":
                        direction = "S";
                        match++;
                        break;
                    case "Q": case "QUIT":
                        direction = "Q";
                        match++;
                        break;
                    default:
                        direction = "X";
                        break;
                }
            }

            if(match > 1) {
                direction = "X";
            }

            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }

        }

//        String[] road = "You are standing at the end of a road before a small brick building".split(" ");
//        for (String i : road) {
//            System.out.println(i);
//        }
//
//        System.out.println();
//
//        String[] building = "You are inside a building, a well house for a small spring".split(", ");
//        for (String i : building) {
//            System.out.println(i);
//        }

    }
}
