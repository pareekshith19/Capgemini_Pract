import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.close();
            return;
        }

        int sumRecursive = calculateSumRecursive(n);
        int sumFormula = calculateSumFormula(n);

        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("Both results are the same.");
        } else {
            System.out.println("Results are different (something went wrong).");
        }

        scanner.close();
    }

    public static int calculateSumRecursive(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + calculateSumRecursive(num - 1);
        }
    }

    public static int calculateSumFormula(int num) {
        return num * (num + 1) / 2;
    }
}