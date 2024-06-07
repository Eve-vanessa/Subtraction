/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.subtraction;

/**
 *
 * @author user 2022
 */
   import java.util.Random;
import java.util.Scanner;

public class Subtraction {

    public static void main(String[] args) {

        // Create Random and Scanner objects
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate two single-digit integers
        int number1 = random.nextInt(10); // Generates a number between 0 and 9
        int number2 = random.nextInt(10); // Generates a number between 0 and 9

        // Ensure number1 >= number2, if not swap them
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Prompt the student with the subtraction question
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int studentAnswer = scanner.nextInt();

        // Calculate the correct answer
        int correctAnswer = number1 - number2;

        // Check the student's answer and display the result
        if (studentAnswer == correctAnswer) {
            System.out.println("Correct! " + number1 + " - " + number2 + " = " + correctAnswer);
        } else {
            System.out.println("Incorrect. " + number1 + " - " + number2 + " = " + correctAnswer);
        }

        // Close the scanner
        scanner.close();
    }
}