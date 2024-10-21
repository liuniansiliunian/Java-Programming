package Week7;

public class Task9 {
    public static int max(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static double max(double num1, double num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static double max(double num1, double num2, double num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static void main(String[] args) {
        System.out.println(max(3, 5));
        System.out.println(max(3.5, 5.1));
        System.out.println(max(3.5, 5.1, 2.9));
    }
}