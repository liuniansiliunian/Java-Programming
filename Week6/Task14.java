package Week6;

public class Task14 {
    public static void main(String[] args) {
        double tuition = 10000;
        double rate = 1.07;
        int years = 0;

        while (tuition < 20000) {
            tuition *= rate;
            years++;
        }
        System.out.println("The tuition will double in " + years + " years.");
        System.out.printf("The tuition is %.2f%n",tuition);
    }
}