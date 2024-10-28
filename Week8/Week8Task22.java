package Week8;

import java.util.Scanner;

public class Week8Task22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        double min = findMin(numbers);
        System.out.println("The minimum value is " + min);
        input.close();
    }

    public static double findMin(double[] array) {
        double min = array[0];
        for (double number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}