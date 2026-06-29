package Array;

public class SmallestElement {
    public static void main(String[] args) {
        int[] num = {20, 30, 40, 35, 25};
        int min = num[1];
        for (int i = 0; i<num.length; i++){
            if(min>num[i]){
                min=num[i];
            }
        }
        System.out.println(min);
    }
}
