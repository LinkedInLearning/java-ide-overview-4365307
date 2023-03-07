package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        double result = Calculator.add(1, 2);
        assertEquals(3.0,result);
    }


}