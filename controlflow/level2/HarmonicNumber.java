package level2;
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (N != 0): ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("N cannot be zero.");
            return;
        }

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("Nth Harmonic Value: " + sum);
    }
}
