import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        int num = getInput("Enter a number: ");
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }

    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static long factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }
}
