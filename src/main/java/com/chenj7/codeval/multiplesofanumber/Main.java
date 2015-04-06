package com.chenj7.codeval.multiplesofanumber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Given numbers x and n, where n is a power of 2, print out the smallest multiple of n which is greater than or
 * equal to x. Do not use division or modulo operator.
 *
 * Created by chenj7 on 4/6/2015.
 */
public class Main {
    public static class MultiplesOfANumber {

        public static int compute(int X, int N) {
            if(X < 0) {
                return N;
            }

            int sum = 0;
            while(sum < X) {
                sum += N;
            }

            return sum;
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
        String[] params = line.split(",");
        if(params.length != 2) {
            return;
        }

        System.out.println(MultiplesOfANumber.compute(Integer.parseInt(params[0]), Integer.parseInt(params[1])));
    }
}
