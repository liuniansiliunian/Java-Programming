package Week7;

public class Task10 {

    public static char getrandom(char ch1, char ch2) {
        int randomInt = (int)(Math.random() * (ch2 - ch1 + 1));
        return (char)(ch1 + randomInt);
    }
    public static char getlowercase() {
        return getrandom('a','z');
    }
    public static char getupper() {
        return getrandom('A','Z');
    }

    public static void main(String[] args) {
        char ch1 = getlowercase();
        char ch2 = getupper();
        System.out.println(ch1);
        System.out.println(ch2);
    }
}