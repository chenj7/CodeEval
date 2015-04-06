package com.chenj7.codeval.sumofprimes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test sum of primes computation
 *
 * Created by chenj7 on 4/6/2015.
 */
public class SumOfPrimesTest {
    @Test
    public void shouldCalculateSumOfPrimesCorrectly() {
        assertEquals("sum of first 10 prime numbers is 129", 129, Main.SumOfPrimes.compute(10));
        assertEquals("sum of first 1000 prime numbers is 3682913", 3682913, Main.SumOfPrimes.compute(1000));
    }

    @Test
    public void shouldDetectAPrimeNumber() {
        assertTrue("7 is a prime", Main.SumOfPrimes.isPrime(7));
        assertTrue("929 is a prime", Main.SumOfPrimes.isPrime(929));
    }
}