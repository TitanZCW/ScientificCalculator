package com.zipcodewilmington.scientificcalculator;

import java.util.function.Consumer;
import java.lang.Math;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to our Calculator!");

        String input = Console.getStringInput("Please enter your formula in the form of \"x + y\" (type \"help\" for a list of operators available):");

        while (true) {
            if (input.equals("help")) {
                Console.println("The available operators are:");
                Console.println("Addition: +");
                Console.println("Subtraction: -");
                Console.println("Multiplication: *");
                Console.println("Division: /");
                input = Console.getStringInput("Enter your formula in the form of \"x + y\"");
            } else if (getOperator(input).equals("+")) {
                double output = addition(getFirstNumber(input), getSecondNumber(input));
                Console.println(String.valueOf(output));
                input = Console.getStringInput("");
            } else if (getOperator(input).equals("-")) {
                double output = subtract(getFirstNumber(input), getSecondNumber(input));
                Console.println(String.valueOf(output));
                input = Console.getStringInput("");
            } else if (getOperator(input).equals("*")) {
                double output = multiply(getFirstNumber(input), getSecondNumber(input));
                Console.println(String.valueOf(output));
                input = Console.getStringInput("");
            } else if (getOperator(input).equals("/")) {
                double output = divide(getFirstNumber(input), getSecondNumber(input));
                Console.println(String.valueOf(output));
                input = Console.getStringInput("");
            }
        }
    }

    public static double getFirstNumber(String input) {
        String array[] = input.split(" ", 2);
        double firstNumber = Double.parseDouble(array[0]);
        return firstNumber;
    }

    public static String getOperator(String input) {
        String array[] = input.split(" ", 3);
        String operator = array[1];
        return operator;
    }

    public static double getSecondNumber(String input) {
        String array[] = input.split(" ", 4);
        double secondNumber = Double.parseDouble(array[2]);
        return secondNumber;
    }

    public static Double addition(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static Double subtract(double num1, double num2) {
        double difference = num1 - num2;
        return difference;
    }

    public static Double multiply(double num1, double num2) {
        double product = num1 * num2;
        return product;
    }

    public static Double divide(double num1, double num2) {
        if (num2 == 0) {
            Console.println("Error, cannot divide by 0");
            return 0.0;
        } else {
            double quotient = num1 / num2;
            return quotient;
        }
    }
}