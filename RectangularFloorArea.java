import java.util.Scanner;

public class RectangularFloorArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = (double)12.5F;
        double width = (double)8.75F;
        double area = length * width;
        System.out.printf("The floor area is: %.2f square meters.%n", area);
    }
}