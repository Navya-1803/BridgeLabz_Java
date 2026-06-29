package controlflow.level2;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of times to flip coin (Positive Integer): ");
        int flips = sc.nextInt();

        if (flips <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int heads = 0, tails = 0;
        for (int i = 0; i < flips; i++) {
            if (Math.random() < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }

        System.out.println("Heads Percentage: " + ((double) heads / flips) * 100 + "%");
        System.out.println("Tails Percentage: " + ((double) tails / flips) * 100 + "%");
    }
}
