package Week6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberToGuess = (int)(Math.random() * 101);
        int guess;

        System.out.println("Guess the number between 0 and 100:");
        while (true) {
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                input.next();
            }
            guess = input.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("You guessed it right!");
                break;
            }
        }
    }
}
