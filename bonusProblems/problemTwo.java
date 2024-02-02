import java.util.Scanner;

public class problemTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 20) {
            System.out.println("Too high.");
        } else if (number < 10) {
            System.out.println("Too low.");
        } else {
            System.out.println("Correct.");
        }

        scanner.close();
    }
}
