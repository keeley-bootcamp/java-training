package com.lloyds;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // String variables
//        String firstName = "Keeley";
//        String lastName = "Gardner";
//        String name = firstName + " " + lastName;
//        System.out.println(name);

        // Numbers
//        int num1 = 1, num2 = 2;
//        System.out.println(num1 + num2);
//
//        double result = (double) num1 / num2;
//        System.out.println(result);
//
//        int num3 = 8;
//        System.out.println(num3++);
//        System.out.println(num3);
//        System.out.println(++num3);

        //User input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your first name?");
        String fName = myScanner.nextLine();

        System.out.println("What is your last name?");
        String lName = myScanner.nextLine();

        System.out.println("Hello " + fName + " " + lName);
        System.out.println("------------------------------------------");

        System.out.println("Enter a number:");
        double userNum1 = myScanner.nextDouble();

        System.out.println("Enter another number:");
        double userNum2 = myScanner.nextDouble();

        System.out.println("The sum of your numbers is: " + (userNum2 + userNum1));
    }
}