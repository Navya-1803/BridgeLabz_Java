package array.level2;

import java.util.Scanner;

public class CouponNumbers {

    public static int getCoupon(int max) {
        return (int) (Math.random() * max);
    }

    public static int collectAllCoupons(int n) {
        boolean[] isCollected = new boolean[n];
        int count = 0;
        int distinct = 0;

        while (distinct < n) {
            int value = getCoupon(n);
            count++;
            if (!isCollected[value]) {
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of distinct coupons (N): ");
        int n = sc.nextInt();

        int totalRandomNumbers = collectAllCoupons(n);
        System.out.println("Total random numbers needed to collect all " + n + " distinct coupons: " + totalRandomNumbers);
    }
}
