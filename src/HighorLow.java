public class k {
}
import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // 1 to 10
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        boolean validInput;

        do {
            System.out.print("Guess the number (1 to 10): ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                validInput = (guess >= 1 && guess <= 10); // Ensure within range
                if (!validInput) {
                    System.out.println("Your guess must be between 1 and 10.");
                }
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                validInput = false;
                scanner.next(); // Clear invalid input
            }
        } while (!validInput);

        System.out.println("The random number is: " + randomNumber);

        if (guess == randomNumber) {
            System.out.println("You guessed it right!");
        } else if (guess < randomNumber) {
            System.out.println("Your guess is too low.");
        } else {
            System.out.println("Your guess is too high.");
        }

        scanner.close();
    }
}