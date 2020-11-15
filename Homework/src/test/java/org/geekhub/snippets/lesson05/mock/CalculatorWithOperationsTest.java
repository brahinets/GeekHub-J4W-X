package org.geekhub.snippets.lesson05.mock;

import org.mockito.Mockito;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorWithOperationsTest {

    private OperationWithOneArgument sqrtOperation;
    private OperationWithTwoArguments sumOperation;

    @BeforeMethod
    public void setUp() {
        sumOperation = Mockito.mock(OperationWithTwoArguments.class);

        OperationWithOneArgument sqrtOperationImplementation = new OperationWithOneArgument() {
            @Override
            public Number calculate(Number argument) {
                return Math.sqrt(argument.doubleValue());
            }
        };
        sqrtOperation = Mockito.spy(sqrtOperationImplementation);
    }

    @Test
    public void add_operation_with_mocks() {
/*
        Mockito.when(
            sumOperation.calculate(
                Mockito.eq(1),
                Mockito.eq(2)
            )
        ).thenReturn(3);
*/

        Number result = sumOperation.calculate(1, 2);

        assertEquals(result, 3);
    }

    @Test
    public void sqrt_operation_with_spy() {
/*
        Mockito.doReturn(3.0).when(sqrtOperation)
            .calculate(4);
*/

        Number result = sqrtOperation.calculate(4);

        assertEquals(result, 2.0);
    }
}