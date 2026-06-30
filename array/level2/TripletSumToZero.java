package level2;

import java.util.Scanner;

public class TripletSumToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (number of integers): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        System.out.println("Distinct Triplets:");
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total distinct triplets: " + count);
    }
}
