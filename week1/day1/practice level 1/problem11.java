import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();

        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double quotient = (number2 != 0) ? number1 / number2 : 0;

        System.out.printf("The addition, subtraction, multiplication, and division value of %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f%n",
                number1, number2, sum, difference, product, quotient);

        scanner.close();
    }
}
