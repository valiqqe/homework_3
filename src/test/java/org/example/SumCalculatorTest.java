package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void testSumWithPositiveNumber() {
        assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    void testSumWithMultipleNumbers() {
        assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    void testSumWithZero() {
        assertEquals(0, sumCalculator.sum(0));
    }

    @Test
    void testSumWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(-1));
    }
}