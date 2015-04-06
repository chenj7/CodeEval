package com.chenj7.codeval.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test FizzBuzz computation
 * Created by chenj7 on 4/6/2015.
 */
public class FizzBuzzTest {
    private String at(final String[] input, int index) {
        return input[index - 1];
    }

    @Test
    public void shouldReturnListTheSizeOfTheThirdParameter() {
        Main.FizzBuzz fizzBuzz = new Main.FizzBuzz(2, 3, 4);
        String[] result = fizzBuzz.compute();

        assertEquals("should return with 4 items", 4, result.length);

        fizzBuzz = new Main.FizzBuzz(5, 3, 8);
        result = fizzBuzz.compute();

        assertEquals("should return with 8 items", 8, result.length);
    }

    @Test
    public void shouldReturnListWithLetterFForItemsDivisibleByFirstParameter() {
        Main.FizzBuzz fizzBuzz = new Main.FizzBuzz(3, 12, 10);
        String[] result = fizzBuzz.compute();

        assertEquals("should have 3 replaced by F", "F", at(result, 3));
        assertEquals("should have 6 replaced by F", "F", at(result, 6));
        assertEquals("should have 9 replaced by F", "F", at(result, 9));
    }

    @Test
    public void shouldReturnListWithLetterBForItemsDivisibleBySecondParameter() {
        Main.FizzBuzz fizzBuzz = new Main.FizzBuzz(12, 3, 10);
        String[] result = fizzBuzz.compute();

        assertEquals("should have 3 replaced by B", "B", at(result, 3));
        assertEquals("should have 6 replaced by B", "B", at(result, 6));
        assertEquals("should have 9 replaced by B", "B", at(result, 9));
    }

    @Test
    public void shouldReturnListWithLettersFBForItemsDivisibleByBothParameters() {
        Main.FizzBuzz fizzBuzz = new Main.FizzBuzz(2, 7, 15);
        String[] result = fizzBuzz.compute();

        assertEquals("FB", at(result, 14));
    }

    @Test(expected = ArithmeticException.class)
    public void shouldThrowArithmeticExceptionOnZeroInputParameter() {
        Main.FizzBuzz fizzBuzz = new Main.FizzBuzz(0, 4, 5);
        fizzBuzz.compute();

        fizzBuzz = new Main.FizzBuzz(4, 0, 5);
        fizzBuzz.compute();
    }

    @Test
    public void shouldHandleInputForSingleItem() {
        Main.FizzBuzz fizzBuzz = new Main.FizzBuzz(1, 2, 1);
        String[] result = fizzBuzz.compute();

        assertEquals("F", at(result, 1));
    }
}