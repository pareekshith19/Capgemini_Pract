import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.printf("The swapped numbers are %d and %d%n", number1, number2);

        scanner.close();
    }
    
}
