package com.chenj7.codeval.uniqueelements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * You are given a sorted list of numbers with duplicates. Print out the sorted list with duplicates removed.
 *
 * Created by chenj7 on 4/6/2015.
 */
public class Main {
    public static class UniqueElements {
        public static Integer[] removeDuplicates(int[] values) {
            Set<Integer> valueSet = new TreeSet<>();
            for(int i : values) {
                valueSet.add(i);
            }

            return valueSet.toArray(new Integer[valueSet.size()]);
        }
    }

    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            if(!line.isEmpty()) {
                System.out.println(handleLine(line.trim()));
            }
        }
    }

    public static String handleLine(String line) {
        String[] valueStrings = line.split(",");
        int[] values = new int[valueStrings.length];
        for(int i = 0; i < values.length; ++i) {
            values[i] = Integer.parseInt(valueStrings[i]);
        }
        String result = "";
        for(Integer i : UniqueElements.removeDuplicates(values)) {
            result += "," + i;
        }

        return result.substring(1);
    }
}
