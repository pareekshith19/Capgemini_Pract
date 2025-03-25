import java.util.Scanner;

public class problem4 {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Converter Menu:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Enter your choice (1-4): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter kilometers: ");
                double km = scanner.nextDouble();
                System.out.println(km + " kilometers = " + convertKmToMiles(km) + " miles");
                break;
            case 2:
                System.out.print("Enter miles: ");
                double miles = scanner.nextDouble();
                System.out.println(miles + " miles = " + convertMilesToKm(miles) + " kilometers");
                break;
            case 3:
                System.out.print("Enter meters: ");
                double meters = scanner.nextDouble();
                System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
                break;
            case 4:
                System.out.print("Enter feet: ");
                double feet = scanner.nextDouble();
                System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}