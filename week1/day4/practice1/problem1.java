import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();
        double interest = calculateSimpleInterest(principal, rate, time);
        System.out.printf("Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f\n",
                interest, principal, rate, time);
        scanner.close();
    }
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}