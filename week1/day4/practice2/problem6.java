import java.util.Scanner;

public class problem6 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Converter Menu:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Enter your choice (1-6): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                System.out.println(fahrenheit + " Fahrenheit = " + convertFahrenheitToCelsius(fahrenheit) + " Celsius");
                break;
            case 2:
                System.out.print("Enter Celsius: ");
                double celsius = scanner.nextDouble();
                System.out.println(celsius + " Celsius = " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit");
                break;
            case 3:
                System.out.print("Enter pounds: ");
                double pounds = scanner.nextDouble();
                System.out.println(pounds + " pounds = " + convertPoundsToKilograms(pounds) + " kilograms");
                break;
            case 4:
                System.out.print("Enter kilograms: ");
                double kilograms = scanner.nextDouble();
                System.out.println(kilograms + " kilograms = " + convertKilogramsToPounds(kilograms) + " pounds");
                break;
            case 5:
                System.out.print("Enter gallons: ");
                double gallons = scanner.nextDouble();
                System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");
                break;
            case 6:
                System.out.print("Enter liters: ");
                double liters = scanner.nextDouble();
                System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gallons");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}