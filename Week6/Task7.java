package Week6;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int i,sum = 0;
        i = sc.nextInt();
        for (;i!=0;) {
            sum += i;
            System.out.println("Enter the number:");
            i = sc.nextInt();
        }
        System.out.println("The sum is: " + sum);
    }
}
