package Week5;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String city1 = sc.nextLine();
        String city2 = sc.nextLine();

            if (city1.compareTo(city2) < 0) {
        System.out.println(city1 + ", " + city2);
            } else {
        System.out.println(city2 + ", " + city1);
        }
    }
}
