package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Memory {


    public static void memoryPicker(){
        String memoryOption = Console.getStringInput("Do you want to store your number to memory? \n (1) Yes (2) No");
        if (memoryOption.equalsIgnoreCase("1")){
            Memory.addToMemory(MainApplication.displayString);
        } else if (memoryOption.equalsIgnoreCase("2")) {

            MainApplication.calculatorPicker();

        } else {
            System.out.println("invalid option");
            MainApplication.calculatorPicker();
        }

    }



    static String memory = "0";
    public static void addToMemory(String s){
        System.out.println("\n (1) To store to memory (M+), \n (2) To reset memory (MC), \n (3) memory, (4) exit");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        if (userInput.equalsIgnoreCase("1")){
            memory = Console.currentDisplay(s);
        } else if (userInput.equalsIgnoreCase("2")){
            memory = "0";
            Console.currentDisplay(memory);
        } else if (userInput.equalsIgnoreCase("3")) {
            Console.currentDisplay(memory);
        } else {
            System.out.println("Invalid entry");
            MainApplication.stayCalcing = false;
            System.exit(0);
        }
        MainApplication.stayCalcing= true;
    }

    public static void memoRecall(){
        System.out.println("Do you want to recall your saved value? 1- Yes 2- No");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("1")){
           Console.currentDisplay(memory);
        } else if (userInput.equalsIgnoreCase("2")) {
            MainApplication.calculatorPicker();
            System.out.println("You are exiting");
            System.exit(0);
        } else {
            System.out.println("Invalid entry");
            System.exit(0);
        }

    }
}




