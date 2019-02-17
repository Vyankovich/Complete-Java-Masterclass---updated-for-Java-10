package com.yankovich;

import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities utilities;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass: Start tests...");
    }

    @Before
    public void setup() {
        utilities = new Utilities();
        System.out.println("Before: instance created.");
    }

    @org.junit.Test
    public void everyNthChar() {
//        fail("This test hasn't been implemented yet");
        char[] output = utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[]{'e', 'l'}, output);
    }

    @org.junit.Test
    public void everyNthChar_NisGreaterThenArrayLength_Test() {
//        fail("This test hasn't been implemented yet");
        char[] output = utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 7);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, output);
    }

    @org.junit.Test // (expected = AssertionError.class)
    public void removePairs_MoreThanTwo_Tests() {
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
    }

    @org.junit.Test // (expected = AssertionError.class)
    public void removePairs_LessThanTwo_Tests() {
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));
        assertNull(null, utilities.removePairs(null));
    }

    @org.junit.Test
    public void converter() {
        assertEquals(300, utilities.converter(10, 5));
    }

    @org.junit.Test (expected = ArithmeticException.class)
    public void converter_divByZero() {
        assertEquals(300, utilities.converter(10, 0));
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertNull(null, utilities.nullIfOddLength("odd"));
        assertNotNull("even", utilities.nullIfOddLength("even"));
    }
}