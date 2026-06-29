package javacoreprogramming.level2;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (A): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (B): ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping:");
        System.out.println("A: " + a + ", B: " + b);
    }
}
