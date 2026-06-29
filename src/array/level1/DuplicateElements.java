package Array;

import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "mango", "apple"};
        int start = 0;
        int end = arr.length-1;
        StringBuffer str = new StringBuffer();
        while(start < end){
            if(arr[start].equals(arr[end])) {
                str.append(arr[start]).append(" ");
            }
            start++;
            end--;
        }

        System.out.println(str.toString());
    }
}
