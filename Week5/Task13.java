package Week5;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String str = input.nextLine();
        char ch = str.charAt(0);
        System.out.println("The character you entered is: " + ch);
    }

}
