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
//        String displayString = Integer.toString(s);
//           System.out.println(displayString);
        System.out.println("Current total: "+ s);
        return s;
    }

    public static void getFirstNumber(int s) {
        int num1 = s;
    }

    public static void getSecondNumber(int s) {
        int num2 = s;
    }

    //set the values of two inputs
    public static void setValues(int x, int y) {
        getFirstNumber(x);
        getSecondNumber(y);
    }


    public static void clearDisplay(String s) {
        // String s = " ";
        ;
    }


    public static double doOperation(String operator, int num1, int num2) {
        double answer;
        switch (operator) {
            case "+":
                answer = num1 + num2;
                break;
            case "-":
                answer = num1 - num2;
                break;
            case "*":
                answer = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    answer = num1 / num2;
                } else {
                    answer = num1; // Error = "Error! Division by zero.";
                }
                break;
            case "^":
                answer = (int) Math.pow(num1, num2);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        //System.out.println(answer);
        return answer;
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










