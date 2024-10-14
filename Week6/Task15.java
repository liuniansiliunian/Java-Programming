package Week6;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        int i =0;
        for(i = 0; i < a.length()/2; i++) {
            char b = a.charAt(i);
            char c = a.charAt(a.length()-i-1);
            if(b != c) {
                System.out.println("is not a palindrome");
                break;
            }
        }if(i==a.length()/2)
            System.out.println("is a palindrome");
    }
}
