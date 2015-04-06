package com.chenj7.codeval.sumofprimes;

/**
 * Write a program which determines the sum of the first 1000 prime numbers.
 *
 * Created by chenj7 on 4/6/2015.
 */
public class Main {
    public static class SumOfPrimes {
        public static int compute(int numberOfSums) {
            int count = 0;
            int currentValue = 2;
            int sum = 0;
            while(count < numberOfSums) {
                if(isPrime(currentValue)) {
                    sum += currentValue;
                    ++count;
                }
                ++currentValue;
            }

            return sum;
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
        System.out.println(SumOfPrimes.compute(1000));
    }
}

