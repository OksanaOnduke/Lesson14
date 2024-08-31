package com.example.Lesson;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTestNG {

    @Test
    public void calculateFactorial_zero() {
        Assert.assertEquals(1, FactorialCalculator.calculateFactorial(0));
    }

    @Test(dataProvider = "positiveNumbers")
    public void calculateFactorial_positive(int n) {
        Assert.assertTrue(FactorialCalculator.calculateFactorial(n) > 0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void calculateFactorial_negative() {
        FactorialCalculator.calculateFactorial(-1);
    }

    @Test(dataProvider = "positiveNumbers")
    public void calculateFactorial_positive_with_assert(int n) {
        long expectedFactorial = 1;
        for (int i = 1; i <= n; i++) {
            expectedFactorial *= i;
        }
        Assert.assertEquals(expectedFactorial, FactorialCalculator.calculateFactorial(n));
    }

    @org.testng.annotations.DataProvider(name = "positiveNumbers")
    public Object[][] positiveNumbers() {
        return new Object[][] {
                {1}, {2}, {3}, {5}, {10}
        };
    }
}