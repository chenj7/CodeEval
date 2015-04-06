package com.chenj7.codeval.reversewords;

import java.io.*;

/**
 * Print to stdout each sentence with the reversed words in it, one per line.
 * Empty lines in the input should be ignored. Ensure that there are no trailing empty spaces in each line you print.
 *
 * Created by chenj7 on 4/6/2015.
 */
public class Main {
    public static class ReverseWords {

        public static String reverse(final String line) {
            String[] words = line.split(" ");
            StringBuilder sb = new StringBuilder(words[words.length - 1]);
            for(int i = words.length - 2; i >= 0; --i) {
                sb.append(" ");
                sb.append(words[i]);
            }

            return sb.toString();
        }
    }

    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            handleLine(line.trim());
        }
    }

    public static void handleLine(String line) {
        if(!line.isEmpty()) {
            System.out.println(ReverseWords.reverse(line));
        }
    }
}
