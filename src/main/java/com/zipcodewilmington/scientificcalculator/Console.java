package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();

        return Integer.parseInt(userInput);
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return Double.parseDouble(userInput);
    }

    public static String currentDisplay(String s) {
        System.out.println("Current total: "+ s);
        return s;
    }

    public static void getFirstNumber(double s) {
        double num1 = s;
    }

    public static void getSecondNumber(double s) {
        double num2 = s;
    }

    //set the values of two inputs
    public static void setValues(double x, double y) {
        getFirstNumber(x);
        getSecondNumber(y);
    }


    public static void clearDisplay() {
        currentDisplay("0");
    }

    public static double doOperation(String operator, double num1, double num2) {
        switch (operator) {
            case "+":
                return add(num1,num2);
            case "-":
                return subtract(num1,num2);
            case "*":
                return multiply(num1,num2);
            case "/":
               return divide(num1, num2);
            case "^":
                return raiseToPower(num1, num2);

            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }

    }

    private static double add(double num1, double num2){
        return num1 + num2;
    }

    private static double subtract(double num1, double num2){
        return num1 - num2;
    }

    private static double multiply(double num1, double num2){
        return num1 * num2;
    }

    private static double divide(double num1, double num2){
        if (num2 != 0) {
            return num1 / num2;
        } else {
            divideByZeroError(num1);
            return num1;
        }
    }

    private static double divideByZeroError(double num1){
        System.out.println("Divide by zero error");
        return (num1);
    }

    private static double raiseToPower(double num1, double num2){
        return (int) Math.pow(num1, num2);
    }



//    public static double doCalc(String s, Double d) {
//        double result = 0;
//        //System.out.println(d);
//        //System.out.println(s);
//        //Create conditional to print out answer based on function chosen
//
//        if (s.equalsIgnoreCase("Log") ) {
//            result = Math.log(d);
//        } else if (s.equalsIgnoreCase("Sin") ) {
//            result = Math.sin(d);
//        } else if (s.equalsIgnoreCase("Tan")) {
//            result = Math.tan(d);
//        } else result = 0;
//
//        System.out.println(result);
//        return result;
//    }

//    public static double doInverseCalc(String i, Double d) {
//        double result = 0;
//
//        if (i.equalsIgnoreCase("Log-1") ) {
//            result = Math.exp(d);
//        } else if (i.equalsIgnoreCase("Sin-1") ) {
//            result = Math.asin(d);
//        } else if (i.equalsIgnoreCase("Tan-1")) {
//            result = Math.atan(d);
//        } else result = 0;
//
//        System.out.println(result);
//        return result;
//    }

}










