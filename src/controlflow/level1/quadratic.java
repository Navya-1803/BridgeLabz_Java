package controlflow;

import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To find the square root of the equation: a*x*x+b*x+c");
        System.out.println("Enter the value of a");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c");
        double c = sc.nextDouble();


        double delta = b*b-4*a*c;

        if (delta>0) {
            double one = (-b + Math.sqrt(delta)) / (2 * a);
            double two = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Square root of the equations are: " + one + " and " + two);
        } else if (delta==0){
            double root = -b / (2 * a);
        } else{
            System.out.println("Equation's root is an imaginary number");
        }
    }
}
