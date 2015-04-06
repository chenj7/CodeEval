package com.chenj7.codeval.bitpositions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Given a number n and two integers p1,p2 determine if the bits in position p1 and p2 are the same or not.
 * Positions p1 and p2 are 1 based.
 *
 * Print to stdout, 'true'(lowercase) if the bits are the same, else 'false'(lowercase).
 *
 * Created by chenj7 on 4/6/2015.
 */
public class Main {
    public static class BitPositions {
        public static boolean compute(int N, int p1, int p2) {
            int p1Shift = 1 << (p1 - 1);
            int p2Shift = 1 << (p2 - 1);
            int p1Mask = N & p1Shift;
            int p2Mask = N & p2Shift;

            return (p1Mask > 0 && p2Mask > 0) || (p1Mask == 0 && p2Mask == 0);
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
        if(params.length != 3) {
            return;
        }

        System.out.println(BitPositions.compute(Integer.parseInt(params[0]), Integer.parseInt(params[1]), Integer.parseInt(params[2])));
    }
}
