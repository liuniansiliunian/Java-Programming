package Week5;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal value: ");
        int number = sc.nextInt();
        if (number >= 0 && number <= 15) {

            System.out.println("The hex value is " + Integer.toHexString(number).toUpperCase());
        } else {

            System.out.println(number + " is an invalid input");

        }
    }
}