package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class SwitchModes {
    static String mode;

    public static void main(String[] args) {
        switchUnitsMode();
    }

    public static void switchUnitsMode(){
        double deg = 40;
        double rad = 0.698;
        System.out.println("Select your mode: Deg or Rad");
        Scanner sc = new Scanner(System.in);
        mode = sc.nextLine();
        if (mode.equalsIgnoreCase("deg")){
            System.out.println("We will change degrees to radian");
            //radian = degree * (pie/180)
            double result = deg * ((Math.PI)/180);
           //Console.currentDisplay(Double.toString(result));
            System.out.println(Double.toString(result));
        } else if (mode.equalsIgnoreCase("rad")) {
            System.out.println("We will change radian to degrees");
            //degree = radian *(180/pie)
            double result = rad * (180/(Math.PI));
            //Console.currentDisplay(Double.toString(result));
            System.out.println(Double.toString(result));
        }
    }

    public static void switchDisplayMode(String s){
        double deg = 40;
        double rad = 0.698;
        System.out.println("Select your mode: binary, octal, decimal, hexadecimal");
        System.out.println("Enter your value: ");
        Scanner sc = new Scanner(System.in);
        mode = sc.nextLine();
        if (mode.equalsIgnoreCase("deg")){
            System.out.println("We will change degrees to radian");
            //radian = degree * (pie/180)
            double result = deg * ((Math.PI)/180);
            //Console.currentDisplay(Double.toString(result));
            System.out.println(Double.toString(result));
        } else if (mode.equalsIgnoreCase("rad")) {
            System.out.println("We will change radian to degrees");
            //degree = radian *(180/pie)
            double result = rad * (180/(Math.PI));
            //Console.currentDisplay(Double.toString(result));
            System.out.println(Double.toString(result));
        }
    }
}
