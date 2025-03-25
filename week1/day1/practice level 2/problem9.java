import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1  ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2  ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3  ");
        double side3 = scanner.nextDouble();

        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;

        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km%n", rounds);

        scanner.close();
    }
}
