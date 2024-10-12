package Week5;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 words seperated by space: ");
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();

        System.out.print("s1 is "+ word1);
        System.out.print("s2 is "+ word2);
        System.out.print("s3 is "+ word3);
        input.close();
    }
}
