package level1;

public class OddPosition {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};
        for(int i = 0; i<num.length; i=i+2){
            System.out.println(num[i]);
        }
    }
}
