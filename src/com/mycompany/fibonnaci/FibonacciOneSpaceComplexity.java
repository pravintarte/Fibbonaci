package com.mycompany.fibonnaci;

import java.util.Scanner;

/**
 * Created by pravin on 28-12-2019.
 */
public class FibonacciOneSpaceComplexity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the limit for the fibonnaci sequence");
        int limit = scanner.nextInt();
        long start = System.currentTimeMillis();
        Integer[] fibSeq = new Integer[limit];
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < limit; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }

        // Print fibonnaci sequnece below

        System.out.println();
        System.out.println("Time taken to calculate fibonnaci series" + (System.currentTimeMillis() - start));
        System.exit(0);
    }
}
