package org.geekhub.snippets.lesson05.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void adding_two_numbers() {
        Calculator calculator = new Calculator();

        int actualResult = calculator.add(1, 2);
        int expectedResult = 3;

        assertEquals(actualResult,expectedResult);
    }

}