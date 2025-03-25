import java.util.Scanner;

public class problem10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] statuses = new String[10];


        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            data[i][0] = scanner.nextDouble();
            System.out.println("Enter height (cm) for person " + (i + 1) + ":");
            data[i][1] = scanner.nextDouble();
        }


        calculateBMI(data);


        statuses = determineBMIStatus(data);


        System.out.println("Weight (kg)\tHeight (cm)\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2] + "\t" + statuses[i]);
        }
        scanner.close();
    }

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0; // Convert cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }
}