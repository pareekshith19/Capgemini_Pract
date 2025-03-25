import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        int n = getInput("Enter the number of Fibonacci terms: ");
        generateFibonacci(n);
    }

    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static void generateFibonacci(int n) {
        int a = 0, b = 1, temp;
        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            temp = a + b;
            a = b;
            b = temp;
        }
    }
}
