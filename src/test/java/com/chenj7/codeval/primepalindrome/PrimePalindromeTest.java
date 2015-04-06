package com.chenj7.codeval.primepalindrome;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test prime palindrome computation.
 *
 * Created by chenj7 on 4/6/2015.
 */
public class PrimePalindromeTest {

    @Test
    public void shouldReturnTheCorrectPrimePalindrome() {
        assertEquals("Input 1000 should yield 929", 929, Main.PrimePalindrome.largest(1000));
        assertEquals("Input 1000 should yield 929", 10601, Main.PrimePalindrome.largest(11000));
    }

    @Test
    public void shouldDetectAPalindrome() {
        assertTrue("929 is a palindrome", Main.PrimePalindrome.isPalindrome(929));
        assertTrue("234432 is a palindrome", Main.PrimePalindrome.isPalindrome(234432));
    }

    @Test
    public void shouldRejectNonPalindromes() {
        assertFalse("123 is not a palindrome", Main.PrimePalindrome.isPalindrome(123));
    }

    @Test
    public void shouldDetectAPrimeNumber() {
        assertTrue("7 is a prime", Main.PrimePalindrome.isPrime(7));
        assertTrue("929 is a prime", Main.PrimePalindrome.isPrime(929));
    }

    @Test
    public void shouldReturnZeroIfNoPrimeFound() {
        assertEquals(0, Main.PrimePalindrome.largest(0));
    }

    @Test
    public void shouldTreatSingleDigitsAsPalindrome() {
        assertTrue("9 is a palindrome", Main.PrimePalindrome.isPalindrome(9));
    }
}