import java.util.Scanner;

public class problem12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double angleDegrees = scanner.nextDouble();

        double[] results = calculateTrigonometricFunctions(angleDegrees);

        System.out.printf("Sine: %.4f\n", results[0]);
        System.out.printf("Cosine: %.4f\n", results[1]);
        System.out.printf("Tangent: %.4f\n", results[2]);

        scanner.close();
    }

    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double angleRadians = Math.toRadians(angleDegrees);

        double sine = Math.sin(angleRadians);
        double cosine = Math.cos(angleRadians);
        double tangent = Math.tan(angleRadians);

        return new double[] { sine, cosine, tangent };
    }
}