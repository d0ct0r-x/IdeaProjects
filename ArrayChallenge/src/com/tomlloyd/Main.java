package com.tomlloyd;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] enteredValues = getIntegers(10);
        System.out.println();
        printArray(enteredValues);
        System.out.println();
        int[] sortedValues = sortIntegers(enteredValues);
        printArray(sortedValues);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] sourceArray) {
//        int[] targetArray = new int[sourceArray.length];
//        for(int i=0; i<sourceArray.length; i++) {
//            targetArray[i] = sourceArray[i];
//        }
        int[] targetArray = Arrays.copyOf(sourceArray, sourceArray.length);
        int temp;
        for(int j=1; j<targetArray.length; j++) {
            for(int i=0; i<(targetArray.length - j); i++) {
                if(targetArray[i+1] < targetArray[i]) {
                    temp=targetArray[i];
                    targetArray[i]=targetArray[i+1];
                    targetArray[i+1]=temp;
                }
            }
        }
        return targetArray;
    }
}
