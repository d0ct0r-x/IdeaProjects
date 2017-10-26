package com.tomlloyd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;

    @Before
    public void setup() {
        this.util = new Utilities();
    }

    @Test
    public void everyNthChar() throws Exception {
        char[] sourceArray = {'h', 'e', 'l', 'l', 'o'};
        char[] expectedArray = {'e', 'l'};
        assertArrayEquals(expectedArray, util.everyNthChar(sourceArray, 2));
        char[] output2 = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, output2);
    }

    @Test
    public void removePairs() throws Exception {
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when arg was null", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));
    }

    @Test
    public void converter() throws Exception {
        assertEquals(300,  util.converter(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void converter_arithmeticException() throws Exception {
        util.converter(10, 0);
    }

    @Test
    public void nullIfOddLength() throws Exception {
        assertEquals("ABAB", util.nullIfOddLength("ABAB"));
        assertNull(util.nullIfOddLength("ABA"));
    }

}