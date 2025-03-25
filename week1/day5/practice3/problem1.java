import java.util.Scanner;

public class problem1 {
    public static double calculateBMI(double weight, double height) {
        double heightInMeters = height / 100;
        return weight / (heightInMeters * heightInMeters);
    }

    public static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static String[][] computeBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double bmi = calculateBMI(data[i][0], data[i][1]);
            result[i][0] = String.format("%.2f", data[i][1]);
            result[i][1] = String.format("%.2f", data[i][0]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getStatus(bmi);
        }
        return result;
    }

    public static void displayResults(String[][] results) {
        System.out.println("Height(cm)  Weight(kg)  BMI    Status");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-6s %s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        String[][] results = computeBMI(data);
        displayResults(results);
        scanner.close();
    }
    
}
