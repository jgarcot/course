package com.roche.vnv.second.bad;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //to obtain input from the command window
        System.out.print("Enter first number: "); //prompt
        int i1 = scanner.nextInt(); //read first number from user

        System.out.print("Enter second number: "); //prompt
        int i2 = scanner.nextInt(); //read second number from user

        int i3 = i1 + i2;

        System.out.println("sum is " + i3); //display sum
    }


}
