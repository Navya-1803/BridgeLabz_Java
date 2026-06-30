package level1;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Palindrome");
        int number = sc.nextInt();
        int orignalnum = number;
        int reverse = 0;

        for(; number != 0; number = number/10){
            int remainder = number%10;
            reverse = (reverse * 10) + remainder;
        }
        System.out.println(reverse);

        if(orignalnum==reverse){
            System.out.println("The number is a Palindrome");
        } else {
            System.out.println("The number is not a Palindrome");
        }
    }
}
