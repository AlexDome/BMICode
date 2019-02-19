package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int Hfeet, Hinches, Weight;
        double Hmeters, BMI;

        System.out.println("Welcome to the BMI Calculator, can you");
        System.out.println("give me your height with only the feet please.");
        Hfeet = keyboard.nextInt();
        System.out.println("Now give me your height with only the inches.");
        Hinches = keyboard.nextInt();
        System.out.println("Your feet to meters is " + Hfeet*0.3048+"m.");
        Hmeters = Hfeet*0.3048;
        System.out.println("Your inches to centimeters is " + Hinches*2.54+"cm.");
        System.out.println("About how much do you weigh in pounds?");
        Weight = keyboard.nextInt();
        System.out.println("Your weight in kilograms is " +Weight*0.453592+"kg.");
        BMI = Weight/Hmeters;
        System.out.println("Your BMI is " + BMI);
        System.out.println("Thank you for using my Body Mass Index Calculator.");
    }
}