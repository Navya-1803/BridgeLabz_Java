package level1;

public class LargestElement {
    public static void main(String[] args) {
        int[] num = {20, 30, 40, 35, 25};
        int max = num[1];
        for (int i = 0; i<num.length; i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        System.out.println(max);
    }
}
