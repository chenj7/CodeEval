package com.chenj7.codeval.fibonacci;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * The Fibonacci series is defined as: F(0) = 0; F(1) = 1; F(n) = F(n-1) + F(n-2) when n>1.
 * Given an integer n?0, print out the F(n).
 *
 * Created by chenj7 on 4/6/2015.
 */
public class Main {
    public static class Fibonacci {
        public static int compute(int n) {
            if(n == 0) {
                return 0;
            } else if(n == 1) {
                return 1;
            } else {
                return compute(n - 1) + compute(n - 2);
            }
        }
    }

    public static void main (String[] args) throws IOException, NumberFormatException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            handleLine(line.trim());
        }
    }

    public static void handleLine(String line) {
        if(!line.isEmpty()) {
            System.out.println(Fibonacci.compute(Integer.parseInt(line)));
        }
    }
}
