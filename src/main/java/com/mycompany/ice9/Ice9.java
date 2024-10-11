/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ice9;

import java.util.Scanner;

/**
 *
 * @author FHATUWANI
 */
public class Ice9 {

    public static void main(String[] args) {
    
            Scanner scanner = new Scanner(System.in);
        
        // Prompting user to input two numbers
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        int option;
        
        // Menu-driven calculation using while loop
        do {
            // Displaying the menu
            System.out.println("\nMenu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("Enter 0 to exit.");
            System.out.println("Enter your choice: ");
            
            option = scanner.nextInt();
            
            switch(option) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case 4:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Calculation not recognized.");
            }
        } while (option != 0);
        
        scanner.close();
    }
}

    
