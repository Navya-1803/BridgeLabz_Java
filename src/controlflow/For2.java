package controlflow;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int num = sc.nextInt();
        int reverse = 0;

        for(; num != 0; num = num/10){
            int remainder = num % 10;
            reverse = (reverse* 10) + remainder;

        }
        System.out.println("The reverse number is: " + reverse);

    }
}
