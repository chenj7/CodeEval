package com.chenj7.codeval.uniqueelements;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test input handling functionality of unique elements problem
 * Created by chenj7 on 4/7/2015.
 */
public class MainTest {
    @Test
    public void shouldPrintOutTheLineInProperFormat() {
        assertEquals("1,2,3,4,5", Main.handleLine("1,2,3,4,5"));
        assertEquals("1,2,3,4", Main.handleLine("1,1,1,2,2,3,3,4,4"));
        assertEquals("2,3,4,5", Main.handleLine("2,3,4,5,5"));
        assertEquals("1", Main.handleLine("1,1,1,1"));
        assertEquals("1,5,7,123", Main.handleLine("1,5,7,7,123"));
        assertEquals("-2,-1,1,5,7,123", Main.handleLine("-2,-1,1,5,7,7,123"));
    }
}