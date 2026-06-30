import java.util.Scanner;

public class CartesianSystem {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        System.out.println("\nCoordinates for line one: ");
        System.out.println("Enter the value of x1: ");
        double x1 = sc.nextInt();
        System.out.println("Enter the value of x2: ");
        double x2 = sc.nextInt();
        System.out.println("Enter the value of y1: ");
        double y1 = sc.nextInt();
        System.out.println("Enter the value of y2: ");
        double y2 = sc.nextInt();

        Point startPoint1 = new Point(x1,y1);
        Point endPoint1 = new Point(x2, y2);
        Line line1 = new Line(startPoint1, endPoint1);

        System.out.println("Coordinates for line two: ");
        System.out.println("Enter the value of x3: ");
        double x3 = sc.nextInt();
        System.out.println("Enter the value of x4: ");
        double x4 = sc.nextInt();
        System.out.println("Enter the value of y3: ");
        double y3 = sc.nextInt();
        System.out.println("Enter the value of y4: ");
        double y4 = sc.nextInt();

        Point startPoint2 = new Point(x3, y3);
        Point endPoint2 = new Point(x4, y4);
        Line line2 = new Line(startPoint2, endPoint2);

        //using java equals is strictly necessary
        boolean equal = line1.equals(line2);
        System.out.println("The length of the two line are same: " + equal);
        int compare = line1.compareTo(line2);
        if(compare == 0) {
            System.out.println("Both the lines are equal");
        } else if (compare > 0) {
            System.out.println("length of line 1 is more than length of line 2");
        } else {
            System.out.println("Length of line 1 is less than length of line 2");
        }
    }
}
