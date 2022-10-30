package com.zipcodewilmington.scientificcalculator;

import java.util.function.Consumer;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {


        double numAdd1 = Console.getDoubleInput("Enter a number to add");
        double numAdd2 = Console.getDoubleInput("Enter another number to add");
        Console.println("Your sum is %.0f ", addition(numAdd1, numAdd2));

        double numSub1 = Console.getDoubleInput("Enter a number to subtract");
        double numSub2 = Console.getDoubleInput("Enter another number to subtract");
        Console.println("Your difference is %.0f ", subtract(numSub1, numSub2));

        double numMult1 = Console.getDoubleInput("Enter a number to multiply");
        double numMult2 = Console.getDoubleInput("Enter another number to multiply");
        Console.println("Your product is %.0f ", multiply(numMult1, numMult2));

        double numDiv1 = Console.getDoubleInput("Enter a number to divide");
        double numDiv2 = Console.getDoubleInput("Enter another number to divide");
        Console.println("Your product is %.0f ", divide(numDiv1, numDiv2));

//        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
    }


    public static Double addition (double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static Double subtract (double num1, double num2) {
        double difference =  num1 - num2;
        return difference;
    }

    public static Double multiply (double num1, double num2) {
        double product = num1 * num2;
        return product;
    }

    public static Double divide (double num1, double num2) {
        double quotient = num1 / num2;
        return quotient;
    }
}
