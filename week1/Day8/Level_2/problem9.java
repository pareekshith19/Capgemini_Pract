import java.util.Scanner;
public class problem9 {
    public static void main(String[] args) {
        double a = getInput("Enter first number: ");
        double b = getInput("Enter second number: ");
        System.out.print("Choose operation (+, -, *, /): ");
        char operation = new Scanner(System.in).next().charAt(0);
        System.out.println("Result: " + calculate(a, b, operation));
    }
    public static double getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }
    public static double calculate(double a, double b, char op) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> (b != 0) ? a / b : Double.NaN;
            default -> Double.NaN;
        };
    }
}
