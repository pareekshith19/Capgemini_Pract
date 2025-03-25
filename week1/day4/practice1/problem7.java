import java.util.Scanner;

public class problem7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        int sum = calculateSum(n);

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        scanner.close();
    }

    public static int calculateSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}