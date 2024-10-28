package Week8;

public class Week8Task21 {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        int j = binarysearch(list,2);
        int k= binarysearch(list,1);
        System.out.println("key index"+j);
        System.out.println("key index"+k);
    }

    public static int binarysearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (key<list[mid]) {
            high = mid - 1;
        }
        else if (key==list[mid]) {
            return mid;
        }
        else if (key>list[mid]) {
            low = mid + 1;
        }
    }
    return -low-1;
    }
}
