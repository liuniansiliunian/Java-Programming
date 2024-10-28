package Week8;

public class Week8Task12 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > average) {
                counter++;
            }
            System.out.println("the average is " + average);
            System.out.println("the number of elements above the average is " + counter);
        }
    }
}
