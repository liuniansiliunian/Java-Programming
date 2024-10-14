package Week6;

public class Task9 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for(int i = 1; i <= n; i++)
            System.out.print("  "+i);
        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
