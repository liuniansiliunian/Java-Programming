package Week5;
import java.util.Scanner;
import static java.lang.Math.*;

    public class Task23 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the length from the center of a pentagon to a vertex (r): ");
            double r = input.nextDouble();

            // 计算边长 s
            double s = 2 * r * sin(PI / 5);

            // 计算面积
            double area = (5 / 4) * tan(PI / 5) * s * s;

            // 输出结果，保留两位小数
            System.out.printf("The area of the pentagon is: %.2f%n", area);
        }
    }
