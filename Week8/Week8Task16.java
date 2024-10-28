package Week8;

public class Week8Task16 {
    public static void main(String[] args) {
        int x =1;
        int[] y =new int[10];
        System.out.println("before"+x);
        System.out.println("before"+y[0]);

        test(x,y);
        System.out.println("after"+x);
        System.out.println("after"+y[0]);
    }
    public static void test(int x,int[] y){
        x = 2;
        y [0] = 5;
    }
}
