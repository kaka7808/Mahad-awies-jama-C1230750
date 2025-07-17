import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height) * (double)703.0F;
        System.out.printf("Your BMI is: %.2f%n", bmi);
        scanner.close();
    }
}
