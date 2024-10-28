package Week8;

import java.util.Scanner;

public class Week8Task2 {
    public static void main(String[] args) {
        double[] mylist = new double[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter" +mylist.length + "values");
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = input.nextDouble();
        }input.close();
    }
}
