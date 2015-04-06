package com.chenj7.codeval.reversewords;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test reversing words functionality
 *
 * Created by chenj7 on 4/6/2015.
 */
public class ReverseWordsTest {
    @Test
    public void shouldReturnWordsInLineInReverseOrder() {
        assertEquals("World Hello", Main.ReverseWords.reverse("Hello World"));
        assertEquals("CodeEval Hello", Main.ReverseWords.reverse("Hello CodeEval"));
        assertEquals("Words Three These", Main.ReverseWords.reverse("These Three Words"));
    }

    @Test
    public void shouldReturnWordIfJustOneWord() {
        assertEquals("Hello", Main.ReverseWords.reverse("Hello"));
    }
}