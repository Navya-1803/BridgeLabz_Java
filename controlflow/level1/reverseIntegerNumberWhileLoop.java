package level1;

import java.util.Scanner;

public class reverseIntegerNumberWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        String num = sc.nextLine();
        int length = num.length();
        String number = "";
        while(length>0){
            number = number + num.charAt(length - 1);
            length--;
        }
        System.out.println(number);
    }
}
