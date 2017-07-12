package com.kodilla.testing.calculator;

/**
 * Created by zevisto on 12.07.17.
 */
public class Calculator {
    public int value1;
    public int value2;

    public Calculator(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int add() {
        return value1 + value2;
    }

    public int substract() {
        return value1 - value2;
    }
}
