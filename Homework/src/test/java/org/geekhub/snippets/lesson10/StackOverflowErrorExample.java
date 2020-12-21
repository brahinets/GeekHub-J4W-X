package org.geekhub.snippets.lesson10;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StackOverflowErrorExample {
    static class FactorialCalculator {
        public int calculate(int number) {
            if (number <= 1) {
                return 1;
            }
            return number * calculate(number - 1);
        }
    }

    private FactorialCalculator factorialCalculator;

    @BeforeMethod
    public void setUp() {
        factorialCalculator = new FactorialCalculator();
    }

    @Test
    public void givenPositiveIntGtOne_whenCalcFact_thenThrowsException() {
        int numToCalcFactorial = 2;

        assertEquals(factorialCalculator.calculate(numToCalcFactorial), 2);
    }

    @Test
    public void givenPositiveIntNoOne_whenCalcFact_thenCorrectlyCalc() {
        int numToCalcFactorial = 1;

        assertEquals(factorialCalculator.calculate(numToCalcFactorial), 1);
    }

    @Test
    public void givenPositiveIntGtOne_whenCalcFact_thenCorrectlyCalc() {
        int numToCalcFactorial = 5;

        assertEquals(factorialCalculator.calculate(numToCalcFactorial), 120);
    }

    @Test
    public void givenNegativeInt_whenCalcFact() {
        int numToCalcFactorial = -1;

        assertEquals(factorialCalculator.calculate(numToCalcFactorial), 1);
    }

}
