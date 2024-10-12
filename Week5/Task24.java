package Week5;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ch = input.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel");
        }
        else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a consonant");
        }
        else {
            System.out.println(ch + " is an invalid input");
        }
    }
}