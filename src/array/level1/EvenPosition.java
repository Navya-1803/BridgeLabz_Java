package Array;

public class EvenPosition {
    public static void main(String[] args) {
        String[] alpha = {"ab", "bc", "cd", "de"};
        for(int i = 1; i<alpha.length; i=i+2){
                System.out.println(alpha[i]);
        }
    }
}
