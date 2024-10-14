import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = 0, height = 0;
        boolean validInput;

        // Get width
        do {
            System.out.print("Enter width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                validInput = width > 0; // Ensure positive
                if (!validInput) {
                    System.out.println("Width must be positive.");
                }
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                validInput = false;
                scanner.next(); // Clear invalid input
            }
        } while (!validInput);

        // Get height
        do {
            System.out.print("Enter height of the rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                validInput = height > 0; // Ensure positive
                if (!validInput) {
                    System.out.println("Height must be positive.");
                }
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                validInput = false;
                scanner.next(); // Clear invalid input
            }
        } while (!validInput);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Diagonal: %.2f%n", diagonal);

        scanner.close();
    }
}