/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */


package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex18 {

    // main
    public static void main(String[] args) {

        // initialize unit then pass to convert
        String unit = C_or_F();
        convert(unit);

    }

    // gets unit of measurement
    public static String C_or_F() {

        // prompts for input, converts to uppercase, and returns converted scan
        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n" +
                "Your choice: ");
        Scanner input = new Scanner(System.in);
        return (input.next()).toUpperCase();

    }

    // converts from unit to unit
    public static void convert(String unit) {

        // set format
        DecimalFormat df = new DecimalFormat("#.##");

        // determines unit to convert to
        if (unit.equals("C")) {

            // prompts for input, stores in F, calculates temperature in C, then prints output
            System.out.print("Please enter the temperature in Fahrenheit: ");
            Scanner input = new Scanner(System.in);
            double F = input.nextDouble();
            double C = (F - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + df.format(C) + ".");

        }

        else if (unit.equals("F")) {

            // prompts for input, stores in C, calculate temperature in F, then prints output
            System.out.print("Please enter the temperature in Celsius: ");
            Scanner input = new Scanner(System.in);
            double C = input.nextDouble();
            double F = (C * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + df.format(F) + ".");

        }
    }
}
