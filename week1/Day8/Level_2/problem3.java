import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        int num = getInput("Enter a number: ");
        System.out.println(num + " is " + (isPrime(num) ? "a Prime number." : "not a Prime number."));
    }

    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
