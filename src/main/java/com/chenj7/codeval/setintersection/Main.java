package com.chenj7.codeval.setintersection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * You are given two sorted list of numbers (ascending order). The lists themselves are comma delimited and the two
 * lists are semicolon delimited. Print out the intersection of these two sets.
 *
 * Print empty new line in case the lists have no intersection.
 *
 * Created by chenj7 on 4/8/2015.
 */
public class Main {
    public static class SetIntersection {
        /**
         * Given two sorted arrays of integers, compute an array containing the values that exist in both the input
         * arrays.
         *
         * @param set1 sorted array of integers
         * @param set2 sorted array of integers
         * @return their intersection as an array of Integer
         */
        public Integer[] compute(final int[] set1, final int[] set2) {
            boolean set1Larger = set1.length > set2.length;
            int[] checker = set1Larger ? set1 : set2;
            int[] checkee = set1Larger ? set2 : set1;
            List<Integer> result = new ArrayList<>();
            int i = 0;
            int j = 0;
            while(i < checker.length && j < checkee.length) {
                if(checker[i] == checkee[j]) {
                    result.add(checker[i]);
                    ++j;
                    ++i;
                } else if(checker[i] > checkee[j]) {
                    ++j;
                } else {
                    ++i;
                }
            }

            return result.toArray(new Integer[result.size()]);
        }
    }

    public static void main (String[] args) throws IOException, NumberFormatException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            if(!line.isEmpty()) {
                printLine(handleLine(line.trim()));
            }
        }
    }

    public static String handleLine(String line) {
        String[] sets = line.split(";");
        if(sets.length != 2) {
            return "";
        }
        int[] set1 = parseSet(sets[0]);
        int[] set2 = parseSet(sets[1]);

        Integer[] result = (new SetIntersection()).compute(set1, set2);
        if(result.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder("" + result[0]);
        for(int i = 1; i < result.length; ++i) {
            sb.append(",").append(result[i]);
        }
        return sb.toString();
    }

    private static int[] parseSet(String set) {
        String[] setStrings = set.split(",");
        int[] result = new int[setStrings.length];

        for(int i = 0; i < setStrings.length; ++i) {
            result[i] = Integer.parseInt(setStrings[i]);
        }

        return result;
    }

    private static void printLine(String line) {
        System.out.println(line);
    }
}
