package level1;

import java.util.Scanner;

public class Binary {

    public static String toBinary(int n) {
        String bin = Integer.toBinaryString(n);
        return String.format("%32s", bin).replace(' ', '0');
    }

    public static int swapNibbles(int n) {
        return ((n & 0x0F) << 4) | ((n & 0xF0) >> 4);
    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (0-255 for byte representation): ");
        int n = sc.nextInt();

        System.out.println("32-bit Binary Representation: " + toBinary(n));

        int swapped = swapNibbles(n);
        System.out.println("After Swapping Nibbles: " + swapped);

        if (isPowerOfTwo(swapped)) {
            System.out.println(swapped + " is a power of 2.");
        } else {
            System.out.println(swapped + " is not a power of 2.");
        }
    }
}
