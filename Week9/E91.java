package Week9;

public class E91 {
    // 移除了static关键字，使Rectangle成为非静态内部类
    class Rectangle {
        double height;
        double width;

        Rectangle(double h, double w) {
            height = h;
            width = w;
        }

        // 计算面积
        double area() {
            return height * width;
        }

        // 计算周长
        double perimeter() {
            return 2 * (height + width);
        }
    }

    public static void main(String[] args) {
        // 创建E91类的实例
        E91 e91Instance = new E91();
        // 使用E91的实例来创建Rectangle的实例
        E91.Rectangle rectangle1 = e91Instance.new Rectangle(4, 40);

        E91.Rectangle rectangle2 = e91Instance.new Rectangle(3.5, 35.9);

        System.out.println("Area: " + rectangle1.area());
        System.out.println("Perimeter: " + rectangle1.perimeter());

        System.out.println("Area: " + rectangle2.area());
        System.out.println("Perimeter: " + rectangle2.perimeter());
    }
}