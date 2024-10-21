package Week7;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int line = 10;
        int counter = 0;
        int number = 2;
        while (counter < numberOfPrimes) {
            if (isPrime(number)) {
                counter++;

                if (counter % line == 0) {
                    System.out.printf("%-5d\n",number);
                }
                else
                    System.out.printf("%-5d",number);
            }
            number++;
        }
    }
    public static boolean isPrime(int number) {
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
