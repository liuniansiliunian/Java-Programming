package week4;
import java.util.Scanner;

public class Labtask21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter day : ");
        int day = input.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");break;
            case 6:
            case 0:
                System.out.println("Weekend");break;
            default:
                System.out.println("Invalid day");
        }
    }
}
