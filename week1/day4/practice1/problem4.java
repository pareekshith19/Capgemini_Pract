import java.util.Scanner;

public class problem4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangular park (meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 of the triangular park (meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 of the triangular park (meters): ");
        double side3 = scanner.nextDouble();

        int rounds = calculateRounds(side1, side2, side3);

        System.out.println("The athlete needs to complete " + rounds + " rounds to complete a 5km run.");

        scanner.close();
    }

    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistanceMeters = 5000; // 5 km = 5000 meters
        return (int) Math.ceil(totalDistanceMeters / perimeter);
    }
}