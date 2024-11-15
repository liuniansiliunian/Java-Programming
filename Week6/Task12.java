package Week6;

public class Task12 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 50) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}