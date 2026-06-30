package level2;

public class PowerOfTwo {
    public static void main(String[] args) {
        if (args.length == 0) return;
        int n = Integer.parseInt(args[0]);

        if (n >= 0 && n < 31) {
            int power = 1;
            for (int i = 0; i <= n; i++) {
                System.out.println("2^" + i + " = " + power);
                power = power * 2;
            }
        } else {
            System.out.println("Only works if 0 <= N < 31");
        }
    }
}