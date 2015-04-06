package com.chenj7.codeval.primepalindrome;

/**
 * Write a program which determines the largest prime palindrome less than 1000.
 *
 * Created by chenj7 on 4/6/2015.
 */

public class Main {
    public static class PrimePalindrome {
        public static int largest(int maxValue) {
            int counter = maxValue - 1;
            while(counter-- > 0) {
                if(isPalindrome(counter)) {
                    if(isPrime(counter)) {
                        return counter;
                    }
                }
            }

            return 0;
        }

        public static boolean isPalindrome(int value) {
            return Integer.toString(value).equals(new StringBuffer(Integer.toString(value)).reverse().toString());
        }

        public static boolean isPrime(int value) {
            for(int i = 2; i < value; ++i) {
                if(value % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main (String[] args) {
        System.out.println(PrimePalindrome.largest(1000));
    }
}
