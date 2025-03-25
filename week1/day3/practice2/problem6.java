import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Persons: ");
        int n = sc.nextInt();
        double[] w = new double[n];
        double[] h = new double[n];
        double[] bmi = new double[n];
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Weight (kg): ");
            w[i] = sc.nextDouble();
            System.out.print("Height (m): ");
            h[i] = sc.nextDouble();
            bmi[i] = w[i] / (h[i] * h[i]);
            if (bmi[i] <= 18.4) s[i] = "Underweight";
            else if (bmi[i] <= 24.9) s[i] = "Normal";
            else if (bmi[i] <= 39.9) s[i] = "Overweight";
            else s[i] = "Obese";
        }
        System.out.println("Results:");
        for (int i = 0; i < n; i++) {
            System.out.printf("H:%.2f W:%.2f BMI:%.2f Status:%s\n", h[i], w[i], bmi[i], s[i]);
        }
        sc.close();
    }
}