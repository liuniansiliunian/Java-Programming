package Week7;

public class Task2 {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i,j);
        System.out.println("the maximum of " + i + " and "+
                j + " is " + k);
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
