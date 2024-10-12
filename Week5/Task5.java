package Week5;

import java.util.Scanner;
import static java.lang.Math.*;

public class Task5{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();


        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // 计算三角形的边长
        double a = sqrt(pow(x2 - x3, 2) + pow(y2 - y3, 2));
        double b = sqrt(pow(x1 - x3, 2) + pow(y1 - y3, 2));
        double c = sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));

        // 计算三角形的角度
        double angleA = Math.toDegrees(acos((pow(b, 2) + pow(c, 2) - pow(a, 2)) / (2 * b * c)));
        double angleB = Math.toDegrees(acos((pow(a, 2) + pow(c, 2) - pow(b, 2)) / (2 * a * c)));
        double angleC = Math.toDegrees(acos((pow(a, 2) + pow(b, 2) - pow(c, 2)) / (2 * a * b)));

        System.out.println("The 3 angles are "+ Math.round(angleA*100)/100.0
                + " " + Math.round(angleB*100)/100.0 + " " + Math.round(angleC*100)/100.0 + " ");
    }
}