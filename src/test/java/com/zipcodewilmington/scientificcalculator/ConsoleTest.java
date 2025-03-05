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
        double actual = console.doOperation("-", 20, 9.3);
        assertEquals(10.70, actual, 0.001);
    }

    @Test
    public void test7DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("-", 750, 99.4);
        assertEquals(650.60, actual, 0.001);
    }


    @Test
    public void test8DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("*", 2, 10);
        assertEquals(20.00, actual, 0.001);
    }

    @Test
    public void test9DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("*", 79.03, 448
        );
        assertEquals(35405.44, actual, 0.001);
    }

    @Test
    public void test10DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("*", 6, -12);
        assertEquals(-72.00, actual, 0.001);
    }

    @Test
    public void test11DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("/", 100, 10);
        assertEquals(10.00, actual, 0.001);
    }

    @Test
    public void test12DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("/", 77, 9);
        assertEquals(8.555, actual, 0.001);
    }

    @Test
    public void test13DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("/", 4028, 11.9);
        assertEquals(338.4874, actual, 0.001);
    }

    @Test
    public void test14DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("^", 2, 6);
        assertEquals(64.00, actual, 0.001);
    }

    @Test
    public void test6DoOperation() {
        Console console = new Console();
        double actual = console.doOperation("*", 3, 6);
        assertEquals(18.00, actual, 0.001);
    }
}
