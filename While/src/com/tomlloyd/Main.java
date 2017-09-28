package com.tomlloyd;

public class Main {

    public static void main(String[] args) {
//        int count = 6;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println();
//
//        count = 1;
//        while(true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//        } while(count != 6);
        for(int n=1; n<=10; n++) {
            System.out.println("For number " + n + " even test is " + isEvenNumber(n));
        }
    }

    public static boolean isEvenNumber(int number) {
        int remainder = number % 2;
        return remainder == 0;
    }
}
