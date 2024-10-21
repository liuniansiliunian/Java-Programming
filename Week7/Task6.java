package Week7;

public class Task6 {
    public static void main(String[] args) {
        int number = 1;
        System.out.println("Before modification, number = " + number);
        modify(number);
        System.out.println("After modification, number = " + number);
    }

    public static void modify(int number) {
        number++;
        System.out.println("number inside the method is " + number);
    }
}