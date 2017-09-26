package com.tomlloyd;

public class Main {

    public static void main(String[] args) {

        int value = 1;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        // CHALLENGE

        char newSwitchValue = 'A';

        switch(newSwitchValue) {
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C':
                System.out.println("Value is C");
                break;
            case 'D':
                System.out.println("Value is D");
                break;
            case 'E':
                System.out.println("Value is E");
                break;
            default:
                System.out.println("Value was not found");

        }
    }
}
