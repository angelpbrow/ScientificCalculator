package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Memory {

    static String memory = "0";
    public static void addToMemory(String s){
        System.out.println("Remember to store to memory 1-(M+), reset memory, 2- (MC) or recall memory 3-(MRC)");
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
            System.exit(0);
        }

        memoRecall();
    }

    public static void memoRecall(){
        System.out.println("Do you want to recall your saved value? 1- Yes 2- No");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("1")){
           Console.currentDisplay(memory);
        } else if (userInput.equalsIgnoreCase("2")) {
            System.out.println("You are exiting");
            System.exit(0);
        } else {
            System.out.println("Invalid entry");
            System.exit(0);
        }

    }
}




