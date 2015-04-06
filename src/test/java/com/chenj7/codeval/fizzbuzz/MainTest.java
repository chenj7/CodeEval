package com.chenj7.codeval.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for FizzBuzz problem application entry point
 * Created by chenj7 on 4/6/2015.
 */
public class MainTest {
    @Test
    public void shouldTreatOutOfBoundsInputAsInvalid() {
        assertFalse("X too small", Main.validateConstraints(0, 5, 30));
        assertFalse("X too large", Main.validateConstraints(21, 5, 30));
        assertFalse("Y too small", Main.validateConstraints(5, 0, 30));
        assertFalse("Y too large", Main.validateConstraints(5, 21, 30));
        assertFalse("N too small", Main.validateConstraints(5, 5, 20));
        assertFalse("N too large", Main.validateConstraints(5, 5, 101));
    }

    @Test
    public void shouldAcceptValidInput() {
        assertTrue(Main.validateConstraints(2, 7, 22));
    }

    @Test
    public void shouldParseProperlyFormattedLines() {
        int[] result = Main.parseLine("3 4 5");
        assertEquals(3, result[0]);
        assertEquals(4, result[1]);
        assertEquals(5, result[2]);
    }

    @Test
    public void shouldProperlyJointResultArray() {
        String[] result = { "1", "2", "F" , "B", "5" };
        assertEquals("1 2 F B 5", Main.joinResult(result));
    }
}