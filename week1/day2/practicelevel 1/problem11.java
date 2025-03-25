import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        while (true) {  // Infinite loop
            System.out.print("Enter a number (0 or negative to stop): ");
            double value = sc.nextDouble();  // Read input

            if (value <= 0) {  // Check for 0 or negative number
                break;  // Exit loop
            }

            total += value;  // Add value to total
        }

        System.out.printf("Total sum: %.2f%n", total);
        sc.close();
    }
}
