package controlflow;

import java.util.Scanner;

public class Operators1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        double a = sc.nextDouble();
        System.out.println("Enter num 2");
        double b = sc.nextDouble();
        System.out.println("Enter num 3");
        double c = sc.nextDouble();

        double one = a+b*c;
        double two = c+a/b;
        double three = a%b+c;
        double four = a*b+c;

        double max = one;
        if(max<two) max = two;
        if(max<three) max = three;
        if(max<four) max = four;

        double min = one;
        if(min>two) min = two;
        if(min>three) min = three;
        if(min>four) min = four;

        System.out.println("i) a+b*c = " + one);
        System.out.println("ii) c+a/b = " + two);
        System.out.println("iii) a%b+c = " + three);
        System.out.println("iv) a*b+c = " + four);
        System.out.println("Max operation value: " + max);
        System.out.println("Min operation value: " + min);


    }
}
