package com.mycompany.fibonnaci;

import java.util.Scanner;
import java.util.stream.Stream;

public class FibonnaciLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the limit for the fibonnaci sequence");
        int limit = scanner.nextInt();
        long start = System.currentTimeMillis();
        Integer[] fibSeq = new Integer[limit];
        fibSeq[0] = 0;
        fibSeq[1] = 1;

        for (int i = 2; i < limit; i++) {
            fibSeq[i] = fibSeq[i - 1] + fibSeq[i - 2];
        }

        // Print fibonnaci sequnece below
        Stream.of(fibSeq).forEach(t -> System.out.print(t + " "));
        System.out.println();
        System.out.println("Time taken to calculate fibonnaci series" + (System.currentTimeMillis() - start));
        System.exit(0);
    }
}
