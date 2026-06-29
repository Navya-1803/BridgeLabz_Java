package methods;

import java.util.Scanner;

public class VendingMachine {
    static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};
    static int totalNotes = 0;

    public static void calculateChange(int amount, int index) {
        if (amount == 0 || index >= notes.length) {
            return;
        }

        int count = amount / notes[index];
        if (count > 0) {
            System.out.println(notes[index] + " Rs Notes: " + count);
            totalNotes += count;
        }

        calculateChange(amount % notes[index], index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter change amount to be returned: ");
        int change = sc.nextInt();

        System.out.println("Notes to be returned:");
        calculateChange(change, 0);
        System.out.println("Total Minimum Notes: " + totalNotes);
    }
}
