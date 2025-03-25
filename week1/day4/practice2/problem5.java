import java.util.Scanner;

public class problem5 {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Converter Menu:");
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");
        System.out.print("Enter your choice (1-5): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter yards: ");
                double yards = scanner.nextDouble();
                System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");
                break;
            case 2:
                System.out.print("Enter feet: ");
                double feet = scanner.nextDouble();
                System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");
                break;
            case 3:
                System.out.print("Enter meters: ");
                double meters = scanner.nextDouble();
                System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");
                break;
            case 4:
                System.out.print("Enter inches: ");
                double inches = scanner.nextDouble();
                System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");
                break;
            case 5:
                System.out.print("Enter inches: ");
                double inchesCm = scanner.nextDouble();
                System.out.println(inchesCm + " inches = " + convertInchesToCentimeters(inchesCm) + " centimeters");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}