package com.zipcodewilmington.scientificcalculator;

import com.sun.source.tree.SwitchTree;

import java.sql.Array;
import java.util.Arrays;
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

       return  Integer.parseInt(userInput);
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return Double.parseDouble(userInput);
    }

    public static void currentDisplay(String s) {

        println("Current total: ", s);
    }

    public static int getFirstNumber(int s){
       int num1 = s;
        return num1;
    }

    public static int getSecondNumber(int s){
       int num2 = s;
        return num2;
    }
    //set the values of two inputs
    public static void setValues(int x, int y) {
        getFirstNumber(x);
        getSecondNumber(y);
    }


    public static void clearDisplay(String s){

    }


    public static int doOperation(String operator, int num1, int num2){
        int answer;
        switch(operator){
            case "+": answer = num1 + num2;
            break;
            case "-": answer = num1 - num2;
                break;
            case "*": answer = num1 * num2;
                break;
            case "/":
                //if (num2 == 0) {
                //  throw new ArithmeticException("Err - Division by Zero");
                //}
                answer = num1 / num2;
                break;
           
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        System.out.println(answer);
        return answer;
    }



}
