import java.util.Scanner;

public class problemThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape:");
        System.out.println("1) Square");
        System.out.println("2) Triangle");

        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                double squareSideLength = scanner.nextDouble();

                if (squareSideLength <= 0) {
                    System.out.println("Error: Side length should be a positive number.");
                } else {
                    double squareArea = squareSideLength * squareSideLength;
                    System.out.println("The area of the square is: " + squareArea);
                }
                break;

            case 2:
                System.out.print("Enter the base length of the triangle: ");
                double triangleBase = scanner.nextDouble();

                System.out.print("Enter the height of the triangle: ");
                double triangleHeight = scanner.nextDouble();

                if (triangleBase <= 0 || triangleHeight <= 0) {
                    System.out.println("Error: Base and height should be positive numbers.");
                } else {
                    double triangleArea = 0.5 * triangleBase * triangleHeight;
                    System.out.println("The area of the triangle is: " + triangleArea);
                }
                break;

            default:
                System.out.println("Error: Invalid choice. Please choose 1 or 2.");
        }

        scanner.close();
    }
}
