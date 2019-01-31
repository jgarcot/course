package com.roche.vnv.second.good;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        //Check it out: https://www.geeksforgeeks.org/final-keyword-java/
        final Scanner scanner = new Scanner(System.in); //to obtain input from the command window

        //Applied DRY
        int number1 = getInputNumberFrom(scanner, "Enter first number: "); //Add proper variable names
        int number2 = getInputNumberFrom(scanner, "Enter second number: ");

        //Do we really need sum variable?

        System.out.println("sum is " + (number1 + number2)); //display sum
    }

    private static int getInputNumberFrom(Scanner scanner, String inputMessage) { //Applied DAMP & not visible from outside Addition class
        System.out.print(inputMessage); //prompt
        return scanner.nextInt(); //read first number from user
    }


}
