import java.util.Scanner;

public class problem10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first, second, result;
        String op;

        System.out.print("Enter the first number: ");
        first = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        op = scanner.next();

        System.out.print("Enter the second number: ");
        second = scanner.nextDouble();

        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }

        scanner.close();
    }
}