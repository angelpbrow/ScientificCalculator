package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScientificCalcTest {

    @Test
    public void test1DoCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doCalc("4", 2.0);
        assertEquals(0.693, actual, 0.001);
    } @Test
    public void test2DoCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doCalc("1", 2.0);
        assertEquals(0.909, actual, 0.001);
    } @Test
    public void test3DoCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doCalc("2", 2.0);
        assertEquals(-0.416, actual, 0.001);
    } @Test
    public void test4DoCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doCalc("3", 2.0);
        assertEquals(-2.185, actual, 0.001);
    }
//test below this point has not been completed

    @Test
    public void test5DoCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doCalc("5", 2.0);
        assertEquals(0.693, actual, 0.001);
    } @Test
    public void test6DoCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doCalc("6", 2.0);
        assertEquals(0.909, actual, 0.001);
    } @Test
    public void test7DoCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doCalc("7", 2.0);
        assertEquals(-0.416, actual, 0.001);
    } @Test
    public void test8DoCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doCalc("8", 2.0);
        assertEquals(-2.185, actual, 0.001);
    }
}
