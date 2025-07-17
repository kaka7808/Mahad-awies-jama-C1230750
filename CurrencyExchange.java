import java.util.Scanner;

public class CurrencyExchange {

    public static void main(String[] args) {
        double EXCHANGE_RATE = 0.95;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in USD: ");
        double usd = scanner.nextDouble();
        double euros = usd * 0.95;
        System.out.printf("Equivalent in Euros: %.2f EUR%n", euros);
        scanner.close();
    }
}
