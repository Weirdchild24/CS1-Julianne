import java.util.Scanner;

public class calculateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the birth year: ");
        int birthYear = scanner.nextInt();

        int currentYear = 2023; // Update this to the current year

        int age = currentYear - birthYear;

        System.out.println("The person's age is: " + age);

        scanner.close();
    }
}
