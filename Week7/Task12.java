package Week7;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full year (e.g., 2012): ");
        int year = sc.nextInt();
        System.out.print("Enter month as number between 1 and 12: ");
        int month = sc.nextInt() - 1;
        printMonth(year, month);
        sc.close();
    }

    public static void printMonth(int year, int month) {
        Calendar calendar = new GregorianCalendar(year, month, 1);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(year + " " + (month + 1) + ":");
        System.out.println("  Sun Mon Tue Wed Thu Fri Sat");


        int offset = firstDayOfWeek - Calendar.SUNDAY;
        for (int i = 0; i < offset; i++) {
            System.out.print("    ");
        }


        for (int day = 1; day <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH); day++) {
            System.out.printf("%4d", day);
            if ((day + offset) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
