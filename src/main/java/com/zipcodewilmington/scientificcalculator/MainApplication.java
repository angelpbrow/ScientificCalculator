package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    static int num1;
    static int num2;

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Console.currentDisplay("0");
        Integer i = Console.getIntegerInput("Enter a number");
        String s = Console.getStringInput("Enter an operation: add, subtract, multiply, divide");
        Integer t = Console.getIntegerInput("Enter another number");
        //Double d = Console.getDoubleInput("Enter a double.");

        //Console.println("The user input %s as a string", s);
        //Console.println("The user input %s as an integer", i);
        //Console.println("The user input %s as a double", d);
        Console.setValues(i,t);
        Console.doOperation(s, i, t);
//        num1 = i;
//        num2 = t;
        System.out.println(i+ t);
    }





}
