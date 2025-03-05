package com.zipcodewilmington.scientificcalculator;

import static com.zipcodewilmington.scientificcalculator.Console.getIntegerInput;

/**
 * Created by leon on 2/9/18.
 */
public class ScientificCalc {

    static double num1;

   // public static void main(String[] args) {
//        Console.println("Welcome to my SCIENCE calculator!");
//        Console.currentDisplay("0");
//        Double d = Console.getDoubleInput("Enter a double:");
//        String s = Console.getStringInput("Enter an operation (Sin, Tan, Log)");
//
//        //Console.println("The user input %s as a string", s);
//        //Console.println("The user input %s as an integer", i);
//        //Console.println("The user input %s as a double", d);
//        //Console.doCalc(d);
////        num1 = d;
//        //System.out.println(d);
//        Console.doCalc(s, d);
   // }

    public static double doCalc(String s, Double d) {
        double result = 0;
        //Create conditional to print out answer based on function chosen

        if (s.equalsIgnoreCase("1") ) {
            result = Math.sin(d);
        } else if (s.equalsIgnoreCase("2")){
            result = Math.cos(d);
        } else if (s.equalsIgnoreCase("3")) {
            result = Math.tan(d);
        } else if (s.equalsIgnoreCase("4") ) {
            result = Math.log(d);
        }
        else {
            result = 0;
        }
        System.out.printf("%.2f%n",result);
        return result;
    }

    public static double doInverseCalc(String i, Double d) {
        double result = 0;

        if (i.equalsIgnoreCase("5") ) {
            result = Math.exp(d);
        } else if (i.equalsIgnoreCase("6") ) {
            result = Math.asin(d);
        } else if (i.equalsIgnoreCase("7")) {
            result = Math.atan(d);
        } else if (i.equalsIgnoreCase("8")){
            result = Math.acos(d);
        }
        else result = 0;

        System.out.printf("%.2f%n",result);
        return result;
    }

    }


















