package Week6;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first positive integer: ");
        int a = input.nextInt();
        System.out.print("Enter second positive integer: ");
        int b = input.nextInt();

        while (b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("The greatest common divisor is: " + a);
    }
}