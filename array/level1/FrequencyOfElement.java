package level1;

public class FrequencyOfElement {
    static int frequency = 0;
    public static void main(String[] args) {
        String[] num= {"1", "2", "3", "1", "2", "3", "2"};
        for(int i =0; i<num.length; i++){
            for(int j=0; j<num.length; j++){
                if(num[i]==num[j]){
                    frequency++;
                }
            }
            System.out.println("Frequency of " + num[i] + " = " + frequency);
            frequency =0;
        }
    }
}
