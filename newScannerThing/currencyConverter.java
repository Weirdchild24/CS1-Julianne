import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in USD: ");
        double usdAmount = scanner.nextDouble();

        // Conversion rate (replace with the actual rate)
        double conversionRate = 1.18;

        double convertedAmount = usdAmount * conversionRate;

        System.out.println("Equivalent amount in another currency: " + convertedAmount);

        scanner.close();
    }
}
