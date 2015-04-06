package com.chenj7.codeval.bitpositions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test bit positions functionality
 *
 * Created by chenj7 on 4/6/2015.
 */
public class BitPositionsTest {
    @Test
    public void shouldRespondWithTrueForCorrectBitPositions() {
        assertTrue("for 86, 2 and 3 have same bits", Main.BitPositions.compute(86, 2, 3));
    }

    @Test
    public void shouldResponseWithFalseForIncorrectBitPositions() {
        assertFalse("for 125, 1 and 2 are not the same bits", Main.BitPositions.compute(125, 1, 2));
    }
}