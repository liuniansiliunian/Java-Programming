package Week5;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 提示用户输入三个城市的名字
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        // 使用if条件语句和compareTo方法对城市进行排序
        if (city1.compareTo(city2) > 0) {
            String temp = city1;
            city1 = city2;
            city2 = temp;
        }
        if (city1.compareTo(city3) > 0) {
            String temp = city1;
            city1 = city3;
            city3 = temp;
        }
        if (city2.compareTo(city3) > 0) {
            String temp = city2;
            city2 = city3;
            city3 = temp;
        }

     
        System.out.println("The three cities in alphabetical order are: ");
        System.out.println(city1);
        System.out.println(city2);
        System.out.println(city3);
    }
}
