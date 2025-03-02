package com.zipcodewilmington.scientificcalculator;

import static com.zipcodewilmington.scientificcalculator.Console.getIntegerInput;

/**
 * Created by leon on 2/9/18.
 */
public class ScientificCalc {

    static double num1;

   // public static void main(String[] args) {
//        Console.println("Welcome to my SCIENCE calculator!");
//        Console.currentDisplay("0");
//        Double d = Console.getDoubleInput("Enter a double:");
//        String s = Console.getStringInput("Enter an operation (Sin, Tan, Log)");
//
//        //Console.println("The user input %s as a string", s);
//        //Console.println("The user input %s as an integer", i);
//        //Console.println("The user input %s as a double", d);
//        //Console.doCalc(d);
////        num1 = d;
//        //System.out.println(d);
//        Console.doCalc(s, d);
   // }

    public static double doCalc(String s, Double d) {
        double result = 0;
        //System.out.println(d);
        //System.out.println(s);
        //Create conditional to print out answer based on function chosen

        if (s.equalsIgnoreCase("Log") ) {
            result = Math.log(d);
        } else if (s.equalsIgnoreCase("Sin") ) {
            result = Math.sin(d);
        } else if (s.equalsIgnoreCase("Tan")) {
            result = Math.tan(d);
        } else result = 0;

        System.out.println(result);
        return result;
    }

    public static double doInverseCalc(String i, Double d) {
        double result = 0;

        if (i.equalsIgnoreCase("Log-1") ) {
            result = Math.exp(d);
        } else if (i.equalsIgnoreCase("Sin-1") ) {
            result = Math.asin(d);
        } else if (i.equalsIgnoreCase("Tan-1")) {
            result = Math.atan(d);
        } else result = 0;

        System.out.println(result);
        return result;
    }

    }

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        System.out.print("Enter a function (Log, Sin, Tan, InverseLog, InvserseSin,InverseTan): ");
        String number = scanner.nextLine();

        if(number)
    }

        //Create conditional to print out answer based on function chosen
       /* switch (operator) {
            case 'Log': answer = Math.log(Double.parseDouble(num1);
                break;
            case 'Sin' : answer = Math.sin(toRadians(Double.parseDouble(num1)));
            case 'Tan' : answer = Math.tan(nMath.toRadians(Double.parseDouble(num1)));
            case '√'   : answer = Math.sqrt(Double.parseDouble(numb1);
            case ''    : answer = Math.;
        }
    }
    }






  //gives user option to make number positive or negative

/* switchSign() {
if (UserInput == "Y") {
//turns negative
 return numb1 * -1;
} else {
//turns positive
 return numb1 * 1;
}


//inverses a number

toInverse() {
return 1 / num1;
}

//produces a factorial

factorial() {
  int num = num1;
  long factorial = 1;
  for (int i = 1; i <= num; ++i)
  {
    factorial *=i;
  }
}

//squares an input num

square() {
int = num1;
return square = num1 * num2;
}





}
*/