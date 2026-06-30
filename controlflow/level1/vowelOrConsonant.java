package level1;

import java.util.Scanner;

public class vowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet");
        char alpha = sc.next().charAt(0);

        switch(alpha){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The alphabet is a Vowel");
                break;
            default:
                System.out.println("The alphabet is a Consonant");
        }
    }
}
