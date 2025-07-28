package com.Numbergame;
import java.util.Scanner;
import java.util.Random;
public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		        Scanner sc = new Scanner(System.in);
		        Random rand = new Random();

		        int maxAttempts = 5;
		        int score = 0;
		        boolean playAgain;

		        do {
		            int numberToGuess = rand.nextInt(100) + 1;
		            int attempts = 0;
		            boolean guessedCorrectly = false;

		            System.out.println(" Guess the number between 1 and 100. You have " + maxAttempts + " attempts!");

		            while (attempts < maxAttempts) {
		                System.out.print("🔢 Enter your guess: ");
		                int userGuess = sc.nextInt();
		                attempts++;

		                if (userGuess == numberToGuess) {
		                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
		                    guessedCorrectly = true;
		                    score++;
		                    break;
		                } else if (userGuess < numberToGuess) {
		                    System.out.println("Too low. Try again.");
		                } else {
		                    System.out.println(" Too high. Try again.");
		                }
		            }

		            if (!guessedCorrectly) {
		                System.out.println(" You've used all attempts. The correct number was " + numberToGuess + ".");
		            }

		            System.out.print("🔁 Do you want to play another round? (yes/no): ");
		            playAgain = sc.next().equalsIgnoreCase("yes");

		        } while (playAgain);

		        System.out.println("\n🏆 Game over! Your total score: " + score);
		        sc.close();
		    }
		

	}


