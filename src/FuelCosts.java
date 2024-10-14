import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons = 0, efficiency = 0, price = 0;
        boolean validInput;

        // Get gallons
        do {
            System.out.print("Enter the number of gallons in the tank: ");
            if (scanner.hasNextDouble()) {
                gallons = scanner.nextDouble();
                validInput = gallons >= 0; // Ensure non-negative
                if (!validInput) {
                    System.out.println("Gallons must be non-negative.");
                }
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                validInput = false;
                scanner.next(); // Clear invalid input
            }
        } while (!validInput);

        // Get efficiency
        do {
            System.out.print("Enter fuel efficiency (miles per gallon): ");
            if (scanner.hasNextDouble()) {
                efficiency = scanner.nextDouble();
                validInput = efficiency > 0; // Ensure positive
                if (!validInput) {
                    System.out.println("Efficiency must be positive.");
                }
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                validInput = false;
                scanner.next(); // Clear invalid input
            }
        } while (!validInput);

        // Get price
        do {
            System.out.print("Enter price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                price = scanner.nextDouble();
                validInput = price >= 0; // Ensure non-negative
                if (!validInput) {
                    System.out.println("Price must be non-negative.");
                }
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                validInput = false;
                scanner.next(); // Clear invalid input
            }
        } while (!validInput);

        double costToDrive100Miles = (100 / efficiency) * price;
        double maxDistance = gallons * efficiency;

        System.out.printf("Cost to drive 100 miles: $%.2f%n", costToDrive100Miles);
        System.out.printf("Max distance with full tank: %.2f miles%n", maxDistance);

        scanner.close();
    }
}