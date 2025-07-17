import java.util.Scanner;

public class TemperaturePrecisionIssue {
Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int fahrenheit = 98;
        double celsius = 0.5555555555555556 * (double) (fahrenheit - 32);
        System.out.printf("Temperature in Celsius: %.1f°C%n", celsius);
    }
}