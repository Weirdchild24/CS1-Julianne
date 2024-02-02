import java.util.Scanner;

public class problemFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your favorite color? ");
        String favoriteColor = scanner.nextLine().toLowerCase();

        if (favoriteColor.equals("red")) {
            System.out.println("I like red too!");
        } else {
            System.out.println("I don't like " + favoriteColor + ". I prefer red.");
        }

        scanner.close();
    }
}
