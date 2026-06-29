package methods;
import java.util.Scanner;

public class TemperatureConversion {
    public static double convertTemperature(double temp, char type) {
        if (type == 'C' || type == 'c') {
            return (temp * 9 / 5) + 32;
        } else if (type == 'F' || type == 'f') {
            return (temp - 32) * 5 / 9;
        }
        return 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C for Celsius, F for Fahrenheit): ");
        char type = sc.next().charAt(0);

        System.out.println("Converted Temperature: " + convertTemperature(temp, type));
    }
}
