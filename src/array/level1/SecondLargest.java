package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 7, 6};
        int max = num[1];
        int second_max = num[2];
        for(int i=0; i<num.length; i++){
            if(second_max<num[i]){
                if(max<num[i]){
                    max= num[i];
                } else {
                    second_max = num[i];
                }
            }
        }
        System.out.println(second_max);
    }
}
