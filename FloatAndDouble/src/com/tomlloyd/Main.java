package com.tomlloyd;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // CHALLENGE

        double myPoundValue = 16d;
        double myKiloValue = myPoundValue * .45359237d;
        System.out.println("16 pounds in kilograms is: " + myKiloValue);
    }
}
