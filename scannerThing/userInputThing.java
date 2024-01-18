import java.util.Scanner;

class userInputThing 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        int additionResult = userInput + 10;
        int multiplicationResult = userInput * 5;
        int subtractionResult = userInput - 3;

        System.out.println("You entered: " + userInput);
        System.out.println("After adding 10: " + additionResult);
        System.out.println("After multiplying by 5: " + multiplicationResult);
        System.out.println("After subtracting 3: " + subtractionResult);

        scanner.close();
    }
}
