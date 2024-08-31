package com.example.lesson;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    void calculateFactorial_zero() {
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5, 10})
    void calculateFactorial_positive(int n) {
        assertTrue(FactorialCalculator.calculateFactorial(n) > 0);
    }

    @Test
    void calculateFactorial_negative() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorial(-1));
    }
}