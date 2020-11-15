package org.geekhub.snippets.lesson05.mock;

import java.util.Objects;

public class CalculatorWithOperations {

    private final OperationWithOneArgument sqrtOperation;
    private final OperationWithTwoArguments sumOperation;

    CalculatorWithOperations(
        OperationWithOneArgument sqrtOperation,
        OperationWithTwoArguments sumOperation
    ) {
        this.sqrtOperation = sqrtOperation;
        this.sumOperation = sumOperation;
    }

    double add(Double x, Double y) {
        Objects.requireNonNull(x);
        Objects.requireNonNull(y);

        return sumOperation.calculate(x, y).doubleValue();
    }

    double sqrt(Double x) {
        Objects.requireNonNull(x);
        return sqrtOperation.calculate(x).doubleValue();
    }
}

