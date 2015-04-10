package com.chenj7.codeval.setintersection;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test for set intersection functionality
 *
 * Created by chenj7 on 4/10/2015.
 */
public class SetIntersectionTest {
    private Main.SetIntersection setIntersection;

    @Before
    public void setUp() {
        setIntersection = new Main.SetIntersection();
    }

    @Test
    public void shouldCorrectlyGenerateIntersectionOfTwoIntArrays() {
        int[] set1 = {1,2,3,4};
        int[] set2 = {4,5,6};
        Integer[] result = setIntersection.compute(set1, set2);
        Integer[] expected = {4};
        assertArrayEquals(expected, result);

        int[] set3 = {7,8,9};
        int[] set4 = {8,9,10,11,12};
        Integer[] result2 = setIntersection.compute(set3, set4);
        Integer[] expected2 = {8,9};
        assertArrayEquals(expected2, result2);
    }

    @Test
    public void shouldHandleOneArraySuperSetOfTheOther() {
        int[] set1 = {1,2,3,4,5,6,7,8,9,10};
        int[] set2 = {4,7,8};
        Integer[] result = setIntersection.compute(set1, set2);
        Integer[] expected = {4,7,8};
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldReturnEmptySetForNonIntersection() {
        int[] set1 = {1,2,3};
        int[] set2 = {4,5,6};
        Integer[] result = setIntersection.compute(set1, set2);
        Integer[] expected = {};
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldReturnEverythingForSameSets() {
        int[] set1 = {2,3,4};
        int[] set2 = {2,3,4};
        Integer[] result = setIntersection.compute(set1, set2);
        Integer[] expected = {2,3,4};
        assertArrayEquals(expected, result);
    }
}