package org.example.service;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        double result = Calculator.add(1, 2);
        assertEquals(3.0, result);
    }

    @Test
    void testSquare() {
        double result = Calculator.square(2.0);
        assertEquals(4.0, result);
    }

    @Test
    void demoOfStream() {
        Calculator.demoStream();
    }

    @Test
    void testAverage(){
        List<Integer> numbers = List.of(1, 3, 8, 10);
        double result = Calculator.calculateAverage(numbers);
        assertEquals(5.5, result);
    }


}