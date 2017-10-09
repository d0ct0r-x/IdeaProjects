package com.example.math;

public class Series {

    public static int nSum(int n) {
        if(n < 0) {
            System.out.println("nSum: ERROR Non-negative integer required.");
            return -1;
        }
        int sum=0;
        for(int i=0; i<=n; i++) {
            sum+=i;
        }
        System.out.println("nSum: The sum of numbers from 0 to " + n + " is " + sum);
        return sum;
    }

    public static int factorial(int n) {
        if(n < 0) {
            System.out.println("factorial: ERROR Non-negative integer required.");
            return -1;
        } else if(n == 0) {
            System.out.println("factorial: The factorial of 0 is 1");
            return 1;
        }
        int factorial=1;
        for(int i=1; i<=n; i++) {
            factorial*=i;
        }
        System.out.println("factorial: The product of numbers from 0 to " + n + " is " + factorial);
        return factorial;
    }

    public static int fibonacci(int n) {
        if(n < 0) {
            System.out.println("fibonacci: ERROR Non-negative integer required.");
            return -1;
        } else if(n == 0) {
            System.out.println("fibonacci: The fibonacci number of f(0) is 0");
            return 0;
        } else if(n == 1) {
            System.out.println("fibonacci: The fibonacci number of f(1) is 1");
            return 1;
        }
        int f0 = 0;
        int f1 = 1;
        int f = 0;
        for(int i=2; i<=n; i++) {
            f = f0 + f1;
            f0 = f1;
            f1 = f;
        }
        System.out.println("factorial: The fibonacci number of f(" + n + ") is " + f);
        return f;
    }

    public static int recursive(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        }
        return recursive(n-1) + recursive(n-2);
    }
}
