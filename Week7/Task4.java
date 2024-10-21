package Week7;

public class Task4 {
    public static String getGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        System.out.println("The grade is " + getGrade(75.5));
        System.out.println("The grade is " + getGrade(59.5));
    }
}