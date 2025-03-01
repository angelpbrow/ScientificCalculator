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
        String s = Console.getStringInput("Enter a string: add, subtract, multiply, divide");
        Integer i = Console.getIntegerInput("Enter an integer");
        Integer t = Console.getIntegerInput("Enter another integer");
        //Double d = Console.getDoubleInput("Enter a double.");

        //Console.println("The user input %s as a string", s);
        //Console.println("The user input %s as a integer", i);
        //Console.println("The user input %s as a double", d);
        Console.setValues(i,t);
        Console.doOperation(s, i, t);
//        num1 = i;
//        num2 = t;
        System.out.println(i+ t);
    }





}
