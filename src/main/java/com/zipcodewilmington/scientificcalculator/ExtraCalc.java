package com.zipcodewilmington.scientificcalculator;

public class ExtraCalc {


    // produces the factorial of input


    public static int factorial(int n) {

        int result = 1, i;
        for (i = 2; i <= n; i++)
            result *= i;
        return result;


    }

    //squares an input

    public static int square(int n) {
        int result;
        return result = n * n;
    }

    //inverses an input

    public static int toInverse(int n) {
        return 1 / n;
    }





//gives user option to make input positive or negative

//    public static int switchSign(int n) {
//        if (userInput == "Y") {
//         //turns negative
//            return n * -1;
//        } else {
//         //turns positive
//            return n ;
//        }
//
//
//    }
}
