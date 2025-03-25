import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("The %.2f Fahrenheit is %.2f Celsius%n", fahrenheit, celsius);

        scanner.close();
    }
    
}
