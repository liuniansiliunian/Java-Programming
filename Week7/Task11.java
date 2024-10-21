package Week7;

public class Task11 {
    public static void main(String[] args) {
        final int NCHARS = 175;
        final int LINE = 25;

        for (int i = 0; i < NCHARS; i++) {
            char ch = Task10.getlowercase();
            if((i + 1) % LINE ==0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }
}
