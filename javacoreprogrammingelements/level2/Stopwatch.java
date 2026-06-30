package level2;

import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type 'start' to begin the stopwatch: ");
        sc.next();
        long startTime = System.currentTimeMillis();

        System.out.println("Type 'stop' to end the stopwatch: ");
        sc.next();
        long endTime = System.currentTimeMillis();

        long elapsed = endTime - startTime;
        System.out.println("Elapsed Time: " + elapsed + " milliseconds (" + (elapsed / 1000.0) + " seconds)");
    }
}
