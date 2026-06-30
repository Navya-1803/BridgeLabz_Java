package level1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] num  = {1, 2, 3, 4, 6, 4, 2};
        System.out.println("Original Array: " + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Sorted Array: "+ Arrays.toString(num));
    }
}
