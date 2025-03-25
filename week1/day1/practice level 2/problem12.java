import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        double weightInKg = weightInPounds / 2.2;

        System.out.printf("The weight of the person in pounds is %.2f and in kilograms is %.2f%n",
                weightInPounds, weightInKg);

        scanner.close();
    }
}
