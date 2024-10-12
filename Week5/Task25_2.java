package Week5;

import java.util.Scanner;

public class Task25_2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters (first for major and second for status): ");
        String characters = input.nextLine();

        // 确定主修和状态
        char majorChar = characters.charAt(0);
        char statusChar = characters.charAt(1);

        // 确定主修
        String major;
        switch (majorChar) {
            case 'M':
                major = "Mathematics";
                break;
            case 'C':
                major = "Computer Science";
                break;
            case 'I':
                major = "Information Technology";
                break;
            default:
                major = "Unknown Major";
                break;
        }

        // 确定年级
        String status;
        switch (statusChar) {
            case '1':
                status = "Freshman";
                break;
            case '2':
                status = "Sophomore";
                break;
            case '3':
                status = "Junior";
                break;
            case '4':
                status = "Senior";
                break;
            default:
                status = "Invalid Status";
                break;
        }


        System.out.println(major + " "+ status);

    }
}