package Week9;

public class ex92 {
    public static void main(String[] args) {

        // Create a circle of radius 1
        Circle Circle1 = new Circle();
        System.out.println("The area of the circle of radius " + Circle1.radius + " is " + Circle1.getArea());

        // Create a circle of radius 25
        Circle Circle2 = new Circle(25);
        System.out.println("The area of the circle of radius " + Circle2.radius + " is " + Circle2.getArea());

        // Create a circle of radius 75
        Circle Circle3 = new Circle(75);
        System.out.println("The area of the circle of radius " + Circle3.radius + " is " + Circle3.getArea());

        // Change the radius of circle 2
        Circle2.radius = 100;
        Circle2.setRadius(100);
        System.out.println("The area of the circle of radius " + Circle2.radius + " is " + Circle2.getArea());
    }

   static class Circle{
       // Circle class
       double radius;

       // First constructor
       Circle() {
           radius = 1; // constructor without arguments
       }

       Circle(double newRadius) {
           radius = newRadius; // constructor with arguments
       }

       // get area of this circle
       double getArea() {
           return radius * radius * Math.PI;
       }

       // get perimeter of this circle
       double getPerimeter() {
           return 2 * Math.PI * radius;
       }

       // set new radius for this circle
       void setRadius(double newRadius) {
           radius = newRadius;
       }
   }
}
