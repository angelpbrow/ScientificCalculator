package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScientificCalcTest {

    @Test
    public void test1DoCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doCalc("Log", 2.0);
        assertEquals(0.69, actual, 0.001);
    } @Test
    public void test2DoCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doCalc("Sin", 2.0);
        assertEquals(0.909, actual, 0.001);
    } @Test
    public void test3DoCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doCalc("Cos", 2.0);
        assertEquals(-0.416, actual, 0.001);
    } @Test
    public void test4DoCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doCalc("Tan", 2.0);
        assertEquals(-2.185, actual, 0.001);
    }
}
