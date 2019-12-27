package com.mycompany.fibonnaci;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by pravin on 27-12-2019.
 */
public class FibonnacciUsingStreams {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the limit for the fibonnaci sequence");
        int limit = scanner.nextInt();
        long start = System.currentTimeMillis();

        Stream.iterate(new Integer[]{1, 1}, f -> new Integer[]{f[1], f[0] + f[1]}).limit(limit).map(x -> x[0]).forEach(x -> System.out.print(x + " "));

        System.out.println();
        System.out.println("Time taken to calculate fibonnaci series" + (System.currentTimeMillis() - start));
        System.exit(0);
    }

}
