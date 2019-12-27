package com.mycompany.fibonnaci;

import java.util.Scanner;

/**
 * Created by pravin on 27-12-2019.
 */
public class FibonnaciUsingCaching {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the limit for the fibonnaci sequence");
        int limit = scanner.nextInt();
        long start = System.currentTimeMillis();
        Integer[] fibSeq = new Integer[limit];

        for (int i = 0; i < limit; i++) {
            System.out.print(fib(i, fibSeq) + " ");
        }
        System.out.println();
        System.out.println("Time taken to calculate fibonnaci series" + (System.currentTimeMillis() - start));
    }

    public static int fib(int i, Integer[] fibSeq) {
        if (i == 0 || i == 1) {
            return i;
        }
        if (fibSeq[i] != null) {
            return fibSeq[i];
        } else {
            fibSeq[i] = fib(i - 1, fibSeq) + fib(i - 2, fibSeq);
            return fibSeq[i];
        }
    }


}
