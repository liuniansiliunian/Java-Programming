package Week6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.println("Enter numbers to sum (0 to end): ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                input.next();
            }
            number = input.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Sum is " + sum);
    }
}