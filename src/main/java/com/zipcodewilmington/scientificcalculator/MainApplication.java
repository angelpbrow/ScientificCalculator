
package com.zipcodewilmington.scientificcalculator;

import static com.zipcodewilmington.scientificcalculator.Console.getIntegerInput;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    static int num1;
    static int num2;

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Console.println("Say hi, Don't be shy!");
        Console.currentDisplay("0");
        Integer i = getIntegerInput("Enter a number:");
        String s = Console.getStringInput("Enter an operation (+,-,/,*,^)");
        Integer t = getIntegerInput("Enter another number:");

        Double d = Console.getDoubleInput("Enter a double.");

        //Console.println("The user input %s as a string", s);
        //Console.println("The user input %s as an integer", i);
        //Console.println("The user input %s as a double", d);
        Console.setValues(i,t);
        Console.doOperation(s, i, t);

        //Console.doCalc(d);
//        num1 = i;
//        num2 = t;
        System.out.println(i+ t);
    }





}
