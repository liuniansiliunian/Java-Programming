package exercise;

public class q9 {
    public static void main(String[] args) {
        double width = 4.5;
        double height = 7.9;
        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println(String.format("Area: %.2f", area));
        System.out.println(String.format("Perimeter: %.2f", perimeter));
    }
}