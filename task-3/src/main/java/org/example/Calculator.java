package org.example;

public class Calculator {
    public static float operation(char operation, float x1,float x2){
        switch(operation){
            case '+':
                return CalculatorOperations.sum(x1, x2);
            case '-':
                return CalculatorOperations.subtract(x1, x2);
            case '*':
                return CalculatorOperations.multiply(x1, x2);
            case '/':
                return CalculatorOperations.divide(x1, x2);
            default:
                throw new ArithmeticException("Operator not Found");
        }
    }
}
