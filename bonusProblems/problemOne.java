import java.util.Scanner;

public class problemOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You can vote.");
        } else if (age == 17) {
            System.out.println("You can learn to drive.");
        } else if (age == 16) {
            System.out.println("You can buy a lottery ticket.");
        } else {
            System.out.println("You can trick or treat.");
        }

        scanner.close();
    }
}
