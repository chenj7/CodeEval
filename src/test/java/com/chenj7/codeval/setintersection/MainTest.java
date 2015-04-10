package com.chenj7.codeval.setintersection;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for set interaction prep methods
 * Created by chenj7 on 4/10/2015.
 */
public class MainTest {
    @Test
    public void shouldPrintOutCorrectFormat() {
        assertEquals("3,4", Main.handleLine("3,4,5;1,2,3,4"));
    }

    @Test
    public void shouldPrintOutEmptyStringForNoIntersection() {
        assertEquals("", Main.handleLine("1,2,3;4,5,6"));
    }

    @Test
    public void shouldPrintOutEmptyForInputWithInvalidNumberOfSets() {
        assertEquals("", Main.handleLine("1,2,3"));
        assertEquals("", Main.handleLine("1,2,3;4,5,6;7,8"));
    }
}