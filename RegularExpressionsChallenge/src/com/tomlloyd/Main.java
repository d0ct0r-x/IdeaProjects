package com.tomlloyd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String challenge1 = "I want a bike.";
        String regex1 = "^I want a bike\\.$";
        System.out.println("1: " + challenge1.matches(regex1));

        System.out.println();

        String challenge2 = "I want a ball.";
        String regex2 = "^I want a (bike|ball)\\.$";
        System.out.println("2: " + challenge1.matches(regex2));
        System.out.println("2: " + challenge2.matches(regex2));

        System.out.println();

        Pattern pattern3 = Pattern.compile(regex2);
        Matcher matcher3 = pattern3.matcher(challenge1);
        System.out.println("3: " + matcher3.matches());
        matcher3 = pattern3.matcher(challenge2);
        System.out.println("3: " + matcher3.matches());

        System.out.println();

        String challenge4 = "Replace all blanks with underscores.";
        String regex4 = "\\s";
        System.out.println("4: " + challenge4.replaceAll(regex4, "_"));

        System.out.println();

        String challenge5 = "aaabccccccccdddefffg";
        String regex5 = "^a+b+c+d+e+f+g+$";
        System.out.println("5: " + challenge5.matches(regex5));

        System.out.println();

        String challenge7 = "abcd.135";
        String regex7 = "^[a-z]+\\.[0-9]+$";
        System.out.println("7: " + challenge7.matches(regex7));

        System.out.println();

//        String challenge8 = "abcd.135uvqz.7tzik.999";
        String challenge8 = "abcd.135\tuvqz.7\ttzik.999\n";
        String regex8 = "[a-z]+\\.([0-9]+)";
        Pattern pattern8 = Pattern.compile(regex8);
        Matcher matcher8 = pattern8.matcher(challenge8);
        int count = 0;
        while (matcher8.find()) {
            count++;
            System.out.println("8: Occurrence " + count + "- " + matcher8.group(1));
            System.out.println("8: Occurrence " + count + "- " + "start=" + matcher8.start(1) + " end=" + (matcher8.end(1) - 1));
        }

        System.out.println();

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        String regex11 = "\\{(\\d), (\\d)\\}";
        Pattern pattern11 = Pattern.compile(regex11);
        Matcher matcher11 = pattern11.matcher(challenge11);
        count = 0;
        while (matcher11.find()) {
            count++;
            System.out.println("11: Occurrence " + count + "- " + matcher11.group(0));
            System.out.println("11: Occurrence " + count + "- " + "x=" + matcher11.group(1) + " y=" + matcher11.group(2));
        }

        System.out.println();

        String challenge12 = "11111";
        String regex12 = "^\\d{5}$";
        System.out.println("12: " + challenge12.matches(regex12));

        System.out.println();

        String challenge13 = "11111-1111";
        String regex13 = "^\\d{5}-\\d{4}$";
        System.out.println("13: " + challenge13.matches(regex13));

        System.out.println();

        String regex14 = "^\\d{5}(-\\d{4})?$";
        System.out.println("14: " + challenge12.matches(regex14));
        System.out.println("14: " + challenge13.matches(regex14));




    }
}
