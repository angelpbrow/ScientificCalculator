package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsoleTest {



    @Test
    public void test1DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("+", 20, 10);
        assertEquals(30.00, actual, 0.001);
    }
    @Test
    public void test2DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("+", 2110, 10.33);
        assertEquals(2120.33, actual, 0.001);
    }

    @Test
    public void test3DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("+", 30.5, 20.2);
        assertEquals(50.7, actual, 0.001);
    }

    @Test
    public void test4DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("+", 20, 10);
        assertEquals(30.00, actual, 0.001);
    }

    @Test
    public void test5DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("-", 20, 10);
        assertEquals(10.00, actual, 0.001);
    }

    @Test
    public void test6DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("*", 2, 10);
        assertEquals(20.00, actual, 0.001);
    }

    @Test
    public void test7DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("/", 100, 10);
        assertEquals(10.00, actual, 0.001);
    }

    @Test
    public void test8DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("^", 2, 6);
        assertEquals(64.00, actual, 0.001);
    }
}
