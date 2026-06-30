package level2;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (M): ");
        int m = sc.nextInt();
        System.out.print("Enter number of cols (N): ");
        int n = sc.nextInt();

        int[][] array = new int[m][n];
        System.out.println("Enter " + (m * n) + " inputs:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        pw.println("The 2D Array is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                pw.print(array[i][j] + " ");
            }
            pw.println();
        }
        pw.flush();
    }
}
