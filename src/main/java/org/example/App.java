package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Vishal Choday
 */
/*
Exercise 18 - Temperature Converter
        You’ll often need to determine which part of a program is run based on user input or other events.

        Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit. Prompt for the starting temperature. The program should prompt for the type of conversion and then perform the conversion.

        The formulas are

        C = (F − 32) × 5 / 9
        and

        F = (C × 9 / 5) + 32
        Example Output
        Press C to convert from Fahrenheit to Celsius.
        Press F to convert from Celsius to Fahrenheit.
        Your choice: C
        Please enter the temperature in Fahrenheit: 32
        The temperature in Celsius is 0.

        Constraints
        Ensure that you allow upper or lowercase values for C and F.
        Use as few output statements as possible and avoid repeating output strings.
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.println("Your choice: ");
        String moving = input.nextLine();

        if (moving.equals("C") || moving.equals("c")) {
            moving = "C";
        }

        if (moving.equals("F") || moving.equals("f")) {
            moving = "F";
        }


        if(moving.equals("C")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            String the_other_temp = input.nextLine();

            double num_of_degree;
            num_of_degree = Double.parseDouble
                    (the_other_temp);



            System.out.println("The temperature in Celsius is " + ((num_of_degree - 32) * 5 / 9));
        }else if
        (moving.equalsIgnoreCase("f")){

            System.out.print("Please enter the temperature in Celsius: ");
            String the_other_temp = input.nextLine();

            double num_of_degree;
            num_of_degree = Double.parseDouble(the_other_temp);


            System.out.println("The temperature in Fahrenheit is " + ((num_of_degree * 9 / 5) + 32 ) + "%d");
        }

    }
}
