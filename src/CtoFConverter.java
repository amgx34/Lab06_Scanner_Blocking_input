import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0;
        boolean validInput;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                validInput = true;
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                validInput = false;
                scanner.next(); // Clear invalid input
            }
        } while (!validInput);

        scanner.close();
    }
}