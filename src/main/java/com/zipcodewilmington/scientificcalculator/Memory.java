package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Memory {

    static String memory = "0";
    String ahh = "14";
    public static void addToMemory(String s){
        System.out.println("Remember to store to memory (M+), reset memory(MC) or recall memory (MRC)");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        if (userInput.equalsIgnoreCase("M+")){
            memory = Console.currentDisplay(s);
        } else if (userInput.equalsIgnoreCase("MC")){
            memory = "0";
        } else {
            Console.currentDisplay(memory);
        }
    }
}
