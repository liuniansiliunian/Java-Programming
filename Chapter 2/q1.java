package exercise2;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius:");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9.0/5) + 32;
        System.out.println(celsius+" Celsius is "+fahrenheit+" Fahrenheit");

    }
}
