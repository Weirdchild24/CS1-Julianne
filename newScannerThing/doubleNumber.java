import java.util.Scanner;

public class doubleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double doubledNumber = number * 2;

        System.out.println("Double of the number is: " + doubledNumber);

        scanner.close();
    }
}
