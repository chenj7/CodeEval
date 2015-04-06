package com.chenj7.codeval.multiplesofanumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test functionality for multiples of a number computation
 *
 * Created by chenj7 on 4/6/2015.
 */
public class MultiplesOfANumberTest {
    @Test
    public void shouldFindTheSmallestMultipleOfANumber() {
        assertEquals(16, Main.MultiplesOfANumber.compute(13, 8));
        assertEquals(32, Main.MultiplesOfANumber.compute(17, 16));
    }

    @Test
    public void shouldReturnNumberNIfXIsLessThanZero() {
        assertEquals(8, Main.MultiplesOfANumber.compute(-2, 8));
    }

    @Test
    public void shouldReturnNumberNIfNEqualsX() {
        assertEquals(8, Main.MultiplesOfANumber.compute(8, 8));
    }
}