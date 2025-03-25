import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f, and Time %.2f years%n",
                simpleInterest, principal, rate, time);

        scanner.close();
    }
    
}
