package Week7;

public class Task7 {
    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;

    }

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println("before swap: " + num1 + ", " + num2);
        swap(num1,num2);
        System.out.println("After swap: " + num1 + ", " + num2);
    }
}