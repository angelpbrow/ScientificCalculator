
package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

import static com.zipcodewilmington.scientificcalculator.Console.getIntegerInput;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    static int num1;
    static int num2;
    static boolean scientific = false;
    static String displayString;

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Console.println("Say hi, Don't be shy!");
        Console.currentDisplay(displayString);

        Console.println("Pick a calculator, Std or sci? ");
        calculatorPicker();
        if (scientific){
            ScientificCalc sci = new ScientificCalc();
            System.out.println("the chose scientific");
            Console.println("Welcome to my SCIENCE calculator!");
            displayString = Console.currentDisplay("0");
            Double d = Console.getDoubleInput("Enter a double:");
            String s = Console.getStringInput("Enter an operation (Sin, Tan, Log, Log-1, Sin-1, Tan-1)");

            //Console.println("The user input %s as a string", s);
            //Console.println("The user input %s as an integer", i);
            //Console.println("The user input %s as a double", d);
            //Console.doCalc(d);
//        num1 = d;
            //System.out.println(d);
            //sci.doCalc(s, d);
            if (s.equalsIgnoreCase("sin")|| s.equalsIgnoreCase("tan") || s.equalsIgnoreCase("log") ){
                displayString = Console.currentDisplay(Double.toString(sci.doCalc(s, d)));
            }
            if (s.equalsIgnoreCase("sin-1")|| s.equalsIgnoreCase("tan-1") || s.equalsIgnoreCase("log-1") ){
                displayString = Console.currentDisplay(Double.toString(sci.doInverseCalc(s, d)));
            }
            //sci.doInverseCalc(s, d);



            SwitchModes.switchUnitsMode(Double.parseDouble(displayString));
           // Memory.addToMemory(displayString);

        } else {
            Integer i = getIntegerInput("Enter a number:");
            String s = Console.getStringInput("Enter an operation (+,-,/,*,^)");
            Integer t = getIntegerInput("Enter another number:");

            //Double d = Console.getDoubleInput("Enter a double.");

            //Console.println("The user input %s as a string", s);
            //Console.println("The user input %s as an integer", i);
            //Console.println("The user input %s as a double", d);
            Console.setValues(i, t);
            double answer = Console.doOperation(s, i, t);
            displayString = Double.toString(answer);
            System.out.println(displayString);
            Console.currentDisplay(displayString);
            //Memory.addToMemory(displayString);
            //Console.doCalc(d);
//        num1 = i;
//        num2 = t;
            //System.out.println(i+ t);
        }
        //Memory.addToMemory(displayString);
    }

    static void calculatorPicker(){
        Scanner sc  = new Scanner(System.in);
        String playerInput = sc.nextLine();
        if (playerInput.equalsIgnoreCase("Std")) {
            scientific = false;
        } else {
            scientific = true;
        }

        System.out.println(scientific);
    }




}
