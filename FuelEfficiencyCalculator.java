import java.util.Scanner;

public class FuelEfficiencyCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter miles driven: ");
        double miles = scanner.nextDouble();
        System.out.print("Enter gallons of gas used: ");
        double gallons = scanner.nextDouble();
        double mpg = miles / gallons;
        System.out.printf("Fuel efficiency: %.2f miles per gallon (MPG)%n", mpg);
        scanner.close();
    }
}