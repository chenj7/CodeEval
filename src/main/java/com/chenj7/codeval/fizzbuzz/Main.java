package com.chenj7.codeval.fizzbuzz;

import java.io.*;

/**
 * Write a program that prints out the final series of numbers where those divisible by X, Y and both
 * are replaced by "F" for fizz, "B" for buzz and "FB" for fizz buzz.
 *
 * Your program should accept a file as its first argument. The file contains multiple separated lines; each line
 * contains 3 numbers that are space delimited. The first number is the first divider (X), the second number is the
 * second divider (Y), and the third number is how far you should count (N). You may assume that the input file is
 * formatted correctly and the numbers are valid positive integers.
 *
 * Created by chenj7 on 4/5/2015.
 */
public final class Main {
    public static class FizzBuzz {
        private final int X;
        private final int Y;
        private final int N;

        public FizzBuzz(int X, int Y, int N) {
            this.X = X;
            this.Y = Y;
            this.N = N;
        }

        public String[] compute() throws ArithmeticException {
            String[] result = new String[N];
            for(int i = 1; i <= N; ++i) {
                if(i % X == 0 && i % Y == 0) {
                    result[i-1] = "FB";
                }else if(i % X == 0) {
                    result[i-1] = "F";
                } else if(i % Y == 0) {
                    result[i-1] = "B";
                } else {
                    result[i-1] = "" + i;
                }
            }

            return result;
        }
    }

    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        FizzBuzz fizzBuzz;
        while ((line = buffer.readLine()) != null) {
            int[] params = parseLine(line.trim());
            if(!validateConstraints(params[0], params[1], params[2])) {
                continue;
            }
            fizzBuzz = new FizzBuzz(params[0], params[1], params[2]);
            printOut(joinResult(fizzBuzz.compute()));
        }
    }

    public static String joinResult(String[] results) {
        StringBuilder sb = new StringBuilder();
        for(String result : results) {
            sb.append(result);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static int[] parseLine(String line) {
        int[] result = new int[3];
        int i = 0;
        for(String value : line.split(" ")) {
            result[i++] = Integer.parseInt(value);
        }

        return result;
    }

    public static boolean validateConstraints(int X, int Y, int N) {
        return (X >= 1 && X <= 20 && Y >= 1 && Y <= 20 && N >= 21 && N <= 100);
    }

    private static void printOut(final String msg) {
        System.out.println(msg);
    }
}
