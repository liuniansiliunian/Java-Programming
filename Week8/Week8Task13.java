package Week8;

public class Week8Task13 {
    public static void main(String[] args) {
        int[] sourceArray = {2,3,1,5,10};
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        System.out.println("target array is:");
        for(int value: targetArray){
            System.out.println(value);
        }
    }
}
