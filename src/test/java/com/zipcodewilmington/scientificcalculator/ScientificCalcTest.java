package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScientificCalcTest {

    @Test
    public void test5DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("Log", 2, 6);
        assertEquals(64.00, actual, 0.001);
    } @Test
    public void test5DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("Sin", 2, 6);
        assertEquals(64.00, actual, 0.001);
    } @Test
    public void test5DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("Cos", 2, 6);
        assertEquals(64.00, actual, 0.001);
    } @Test
    public void test5DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("^", 2, 6);
        assertEquals(64.00, actual, 0.001);
    }
}
