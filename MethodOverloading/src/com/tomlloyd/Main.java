package com.tomlloyd;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(2, 10));
        System.out.println(calcFeetAndInchesToCentimeters(2, 12));
        System.out.println(calcFeetAndInchesToCentimeters(-1, 12));
        System.out.println(calcFeetAndInchesToCentimeters(34));
        System.out.println(1 % 12);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    // CHALLENGE

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet >= 0 && inches >= 0 && inches <= 12) {
            return (12 * feet + inches) * 2.54;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0) {
            double remainderInches = inches % 12;
            double feet = (inches - remainderInches) / 12;
            return calcFeetAndInchesToCentimeters(feet, remainderInches);
        } else {
            return -1;
        }
    }
}
