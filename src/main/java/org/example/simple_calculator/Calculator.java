package org.example.simple_calculator;

public class Calculator {
    public static float calculator(float firstOperand, float secondOperand, char operator){
        switch (operator){
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand != 0){
                    return firstOperand / secondOperand;
                }else throw new RuntimeException("can't div by zero");
            default:
                throw new RuntimeException("invalid operator");
        }
    }
}
