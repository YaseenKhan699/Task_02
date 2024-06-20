package com123;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void testSumGreaterThan100() {
        assertEquals("Sum: 150", Main.processNumbers("70", "80"));
    }

    @Test
    public void testSumEquals100() {
        assertEquals("Product: 2500", Main.processNumbers("50", "50"));
    }

    @Test
    public void testSumLessThan100() {
        assertEquals("Difference: 10", Main.processNumbers("60", "50"));
    }

    @Test
    public void testBothNumbersPositive() {
        assertEquals("Difference: 0", Main.processNumbers("50", "50"));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals("Error: Both numbers must be positive integers.", Main.processNumbers("-10", "50"));
    }

    @Test
    public void testNonIntegerInput() {
        assertEquals("Error: Please provide valid integers.", Main.processNumbers("a", "50"));
    }
}
