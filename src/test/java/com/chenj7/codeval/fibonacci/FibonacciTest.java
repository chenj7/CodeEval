package com.chenj7.codeval.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for fibonacci calculation
 * Created by chenj7 on 4/6/2015.
 */
public class FibonacciTest {
    @Test
    public void shouldReturnZeroForNEqualZero() {
        assertEquals(0, Main.Fibonacci.compute(0));
    }

    @Test
    public void shouldReturnOneForNEqualOne() {
        assertEquals(1, Main.Fibonacci.compute(1));
    }

    @Test
    public void shouldReturnCorrectFibonacciCalculation() {
        assertEquals(5, Main.Fibonacci.compute(5));
        assertEquals(144, Main.Fibonacci.compute(12));
    }
}