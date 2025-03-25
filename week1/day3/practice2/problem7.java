import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();
        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];
        for (int i = 0; i < numPersons; i++) {
            double weight, height;
            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive. Please re-enter.");
                }
            } while (weight <= 0);
            do {
                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive. Please re-enter.");
                }
            } while (height <= 0);
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = weight / (height * height);
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\nBMI Results:");
        System.out.println("-------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("-------------------------------------");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
        scanner.close();
    }
}