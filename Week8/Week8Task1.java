package Week8;

public class Week8Task1 {
    public static void main(String[] args) {
        int[] values = new int[5];
        for(int i = 0; i < values.length; i++){
            values[i] = i + values[i - 1];
        }
        values[0]=values[1]+values[4];
    }
}
