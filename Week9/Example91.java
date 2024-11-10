package Week9;

public class Example91 {

    public static void main(String[] args) {

        // Create a circle with radius 1
        Circle circle1 = new Circle(); // object-1
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        // Create a circle with radius 25
        Circle circle2 = new Circle(25); // object-2
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        // Create a circle with radius 125
        Circle circle3 = new Circle(125); // object-3
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        // Modify circle radius
        circle2.radius = 100; // or circle2.setRadius(100)
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }

    // Circle class: Define the circle class with datafields and methods
    static class Circle {
        double radius; // datafield

        /* Construct a circle with radius 1 */
        Circle() {
            radius = 1; // First constructor with no argument
        }

        /* Construct a circle with a specified radius */
        Circle(double newRadius) {
            radius = newRadius; // Second constructor with argument
        }

        /* Return the area of this circle */
        double getArea() {
            return radius * radius * Math.PI;
        }

        /* Return the perimeter of this circle */
        double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        /* Set a new radius for this circle */
        void setRadius(double newRadius) {
            radius = newRadius;
        }
    }
}