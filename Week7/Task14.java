package Week7;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer :");
        int a = input.nextInt();
        System.out.println("Enter second integer :");
        int b = input.nextInt();
        int c = 0;
        while(b > 0){
            c = b;
            b = a % b;
            a = c;
        }

        System.out.println("The greatest common divisor is : "+ c);
    }

}
