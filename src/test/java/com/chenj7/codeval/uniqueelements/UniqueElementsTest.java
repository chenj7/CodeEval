package com.chenj7.codeval.uniqueelements;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test functionality for removing duplicate elements in array
 * Created by chenj7 on 4/6/2015.
 */
public class UniqueElementsTest {
    @Test
    public void shouldRemoveDuplicateElementsFromSortedArray() {
        int[] input = {1,1,1,2,2,3,3,4,4};
        Integer[] result = Main.UniqueElements.removeDuplicates(input);
        Integer[] expected = {1,2,3,4};

        assertArrayEquals(expected, result);

        int[] input2 = {2,3,3,4,5,5};
        Integer[] result2 = Main.UniqueElements.removeDuplicates(input2);
        Integer[] expected2 = {2,3,4,5};

        assertArrayEquals(expected2, result2);
    }
}