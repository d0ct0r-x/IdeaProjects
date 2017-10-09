package com.tomlloyd;

import java.util.Scanner;

public class X {

    private int x;
    private Scanner scanner = new Scanner(System.in);

    public void x() {
        System.out.println("Enter an integer:");
        this.x = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nThe times table for " + this.x + " is as follows:");
        System.out.println("n" + "\t" + "n * " + this.x);
        for (int x=1; x<=12; x++) {
            System.out.println(x + "\t" + x * this.x);
        }
    }
}
