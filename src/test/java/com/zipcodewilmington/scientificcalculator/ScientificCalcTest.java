package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScientificCalcTest {

    @Test
    public void test1DoCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doCalc("4", 2.0);
        assertEquals(0.693, actual, 0.001);
    }

    @Test
    public void test2DoCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doCalc("1", 2.0);
        assertEquals(0.909, actual, 0.001);
    }

    @Test
    public void test3DoCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doCalc("2", 2.0);
        assertEquals(-0.416, actual, 0.001);
    }

    @Test
    public void test4DoCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doCalc("3", 2.0);
        assertEquals(-2.185, actual, 0.001);
    }
//test below this point has not been completed

    @Test
    public void test5DoInverseCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doInverseCalc("5", 0.5);
        assertEquals(1.649, actual, 0.001);

    }

    @Test
    public void test55DoInverseCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doInverseCalc("5", 0.8);
        assertEquals(2.226, actual, 0.001);
    }

    @Test
    public void test6DoInverseCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doInverseCalc("5", 0.54);
        assertEquals(1.716, actual, 0.001);
    }

    @Test
    public void test66DoInverseCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doInverseCalc("6", 0.7);
        assertEquals(0.775, actual, 0.001);
    }
    @Test
    public void test7DoInverseCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doInverseCalc("7", 3.0);
        assertEquals(1.249, actual, 0.001);
    }
    @Test
    public void test77DoInverseCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doInverseCalc("7", 9.0);
        assertEquals(1.460, actual, 0.001);
    }
    @Test
    public void test8DoInverseCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doInverseCalc("8", 0.6);
        assertEquals(0.927, actual, 0.001);
    }

    @Test
    public void test88DoInverseCalc() {
        Console console = new Console();
        double actual = ScientificCalc.doInverseCalc("8", 0.32);
        assertEquals(1.245, actual, 0.001);
    }
}
