package Week8;

public class Week8Task15 {
    public static void main(String[] args) {
        int[] myarray={1,3,5};
        printArray(myarray);
        System.out.println();
        printArray(new int[] {3,1,2,6,4,2});

    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
