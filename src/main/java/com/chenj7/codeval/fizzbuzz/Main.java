package com.chenj7.codeval.fizzbuzz;

import java.io.*;

/**
 * Write a program that prints out the final series of numbers where those divisible by X, Y and both
 * are replaced by “F” for fizz, “B” for buzz and “FB” for fizz buzz.
 *
 *
 * Created by chenj7 on 4/5/2015.
 */
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
        }
    }
}
