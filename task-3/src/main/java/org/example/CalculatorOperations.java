package org.example;

public class CalculatorOperations {
    public static float sum(float x1, float x2){
        return x1+x2;
    }
    public static float subtract(float x1, float x2){
        return x1-x2;
    }
    public static float multiply(float x1, float x2){
        return x1*x2;
    }
    public static float divide(float x1, float x2){
        if(x2==0){
            throw new ArithmeticException("/ by Zero");
        }
        return x1/x2;
    }

}
