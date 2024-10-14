package Week6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int i = sc.nextInt();
        int sum = 0;
        while(i!=0){
            sum+=i;
            System.out.println("enter the number");
            i = sc.nextInt();
        }
        System.out.println("the sum is" + sum);
    }
}
