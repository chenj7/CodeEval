package com.chenj7.codeval.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test FizzBuzz computation
 * Created by chenj7 on 4/6/2015.
 */
public class FizzBuzzTest {
    private String[] parseResult(final String input) {
        return input.split(" ");
    }

    @Test
    public void shouldReturnListTheSizeOfTheThirdParameter() {
        Main.FizzBuzz fizzBuzz = new Main.FizzBuzz(2, 3, 4);
        String result = fizzBuzz.compute();

        assertEquals("should return string with 4 items", 4, parseResult(result).length);

        fizzBuzz = new Main.FizzBuzz(5, 3, 8);
        result = fizzBuzz.compute();

        assertEquals("should return string with 8 items", 8, parseResult(result).length);
    }

    @Test
    public void shouldReturnListWithLetterFForItemsDivisibleByFirstParameter() {
        Main.FizzBuzz fizzBuzz = new Main.FizzBuzz(3, 12, 10);
        String result = fizzBuzz.compute();

        assertEquals("should have 3, 6, 9 be replaced by F", "1 2 F 4 5 F 7 8 F 10", result);
    }

    @Test
    public void shouldReturnListWithLetterBForItemsDivisibleBySecondParameter() {
        Main.FizzBuzz fizzBuzz = new Main.FizzBuzz(12, 3, 10);
        String result = fizzBuzz.compute();

        assertEquals("should have 3, 6, 9 be replaced by B", "1 2 B 4 5 B 7 8 B 10", result);
    }

    @Test
    public void shouldReturnListWithLettersFBForItemsDivisibleByBothParameters() {
        Main.FizzBuzz fizzBuzz = new Main.FizzBuzz(2, 7, 15);
        String result = fizzBuzz.compute();

        assertEquals("1 F 3 F 5 F B F 9 F 11 F 13 FB 15", result);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldThrowArithmeticExceptionOnZeroInputParameter() {
        Main.FizzBuzz fizzBuzz = new Main.FizzBuzz(0, 4, 5);
        String result = fizzBuzz.compute();

        assertEquals("first parameter zero", "", result);

        fizzBuzz = new Main.FizzBuzz(4, 0, 5);
        result = fizzBuzz.compute();

        assertEquals("second parameter zero", "", result);
    }

    @Test
    public void shouldHandleInputForSingleItem() {
        Main.FizzBuzz fizzBuzz = new Main.FizzBuzz(1, 2, 1);
        String result = fizzBuzz.compute();

        assertEquals("1", result);
    }
}