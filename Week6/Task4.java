package Week6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int answer;

        for (int i = 0; i < 5; i++) {
            number1 = (int)(Math.random() * 10);
            number2 = (int)(Math.random() * 10);
            System.out.println("What is " + number1 + " minus " + number2 + "? ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                input.next();
            }
            answer = input.nextInt();

            if (answer == (number1 - number2)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The answer is " + (number1 - number2));
            }
        }
    }
}
