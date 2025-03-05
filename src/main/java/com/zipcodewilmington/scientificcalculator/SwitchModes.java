package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class SwitchModes {


    public static double switchUnitsMode(double d) {
        String mode= Double.toString(d);
        if (mode.equalsIgnoreCase("1.0")) {
            Console.println("We will change radians to degrees");
            return (Math.toDegrees(d));
        } else if (mode.equalsIgnoreCase("2.0")) {
            Console.println("We will change degrees to radians");
           return Math.toRadians(d);
        } else {
            System.out.println("exiting calculator");
            System.exit(0);
        }
        //Console.currentDisplay(Double.toString(result));
        return 4;
    }


//    public static void switchDisplayMode(String s){
//        double deg = 40;
//        double rad = 0.698;
//        System.out.println("Select your mode: binary, octal, decimal, hexadecimal");
//        System.out.println("Enter your value: ");
//        Scanner sc = new Scanner(System.in);
//        mode = sc.nextLine();
//        if (mode.equalsIgnoreCase("deg")){
//            System.out.println("We will change degrees to radian");
//            //radian = degree * (pie/180)
//            double result = deg * ((Math.PI)/180);
//            //Console.currentDisplay(Double.toString(result));
//            System.out.println(Double.toString(result));
//        } else if (mode.equalsIgnoreCase("rad")) {
//            System.out.println("We will change radian to degrees");
//            //degree = radian *(180/pie)
//            double result = rad * (180/(Math.PI));
//            //Console.currentDisplay(Double.toString(result));
//            System.out.println(Double.toString(result));
//        }
//    }
}
