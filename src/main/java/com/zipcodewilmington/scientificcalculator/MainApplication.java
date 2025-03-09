
package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

import static com.zipcodewilmington.scientificcalculator.Console.getIntegerInput;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    static boolean scientific = false;
    static String displayString = "0";
    static boolean stayCalcing = true;

    public static void main(String[] args) {

            Console.println("Welcome to my calculator!");
            Console.println("Say hi, Don't be shy!");
            Console.currentDisplay(displayString);
        while (stayCalcing) {
            calculatorPicker();
            stayCalcing  = false;
            if (scientific) {
               // ScientificCalc sci = new ScientificCalc()
                Console.println("You chose scientific");
                Console.println("Welcome to my SCIENCE calculator!");
                displayString = Console.currentDisplay("0");
                Double d = Console.getDoubleInput("Enter a number:");
                String s = Console.getStringInput("Enter an operation \n (1)Sin (2)Cos (3)Tan (4)Log \n (5)Log-1 (6)Sin-1 (7)Tan-1 (8)Cos-1 " +
                        "\n (9)Square (10)Inverse (11)factorial (12)SquareRoot");

                scientificMethodPicker(s, d);
                double degreeRadiansSwitch = Console.getDoubleInput("Select your mode: (1)Deg or (2)Rad or any other key to exit");
                displayString = Console.currentDisplay(doubleToString(SwitchModes.switchUnitsMode(degreeRadiansSwitch)));

                Memory.memoryPicker();


            } else {
                Integer i = getIntegerInput("Enter a number:");
                String s = Console.getStringInput("Enter an operation (+,-,/,*,^)");
                Integer t = getIntegerInput("Enter another number:");

                Console.setValues(i, t);
                double answer = Console.doOperation(s, i, t);
                displayString = Double.toString(answer);
                Console.currentDisplay(displayString);
                Memory.memoryPicker();
            }
//            Memory.addToMemory(displayString);

        }
    }
// Selector for which calculator to run (Scientific or Standard).
    static void calculatorPicker(){
        stayCalcing = true;
        String playerInput = Console.getStringInput("Pick a calculator, (1)Standard or (2)Scientific?");
        if (playerInput.equalsIgnoreCase("1")) {
            scientific = false;
        } else if (playerInput.equalsIgnoreCase("2")) {
            scientific = true;
        } else {
            System.out.println("wrong input: Good Bye");
            System.exit(0);
        }
    }

    static  void scientificMethodPicker(String s, double d){

        if (s.equalsIgnoreCase("1")|| s.equalsIgnoreCase("3") || s.equalsIgnoreCase("4") || s.equalsIgnoreCase("2")){
            displayString = Console.currentDisplay(Double.toString(ScientificCalc.doCalc(s, d)));
        } else if (s.equalsIgnoreCase("6")|| s.equalsIgnoreCase("7") || s.equalsIgnoreCase("5")|| s.equalsIgnoreCase("8") ){
            displayString = Console.currentDisplay(Double.toString(ScientificCalc.doInverseCalc(s, d)));
        } else if (s.equalsIgnoreCase("9") ){
            displayString = Console.currentDisplay(Double.toString(ExtraCalc.square(Integer.parseInt(String.valueOf(d)))));
        } else if (s.equalsIgnoreCase("10") ) {
            displayString = Console.currentDisplay(Double.toString(ExtraCalc.toInverse(Integer.parseInt(String.valueOf(d)))));
        }
        else if (s.equalsIgnoreCase("11")) {
            displayString = Console.currentDisplay(Double.toString(ExtraCalc.factorial(Integer.parseInt(String.valueOf(d)))));
        }
//        else if (s.equalsIgnoreCase("12") ) {
//            displayString = Console.currentDisplay(Double.toString(ExtraCalc.switchSign(Integer.parseInt(String.valueOf(d)))));
//        }
        else {

            return;
        }
    }

    static String doubleToString(double d){
        return Double.toString(d);
    }


}
