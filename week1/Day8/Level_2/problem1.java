import java.util.Random;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int low = 1, high = 100, guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100. I will try to guess it!");

        while (true) {
            guess = low + random.nextInt(high - low + 1);
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', 'correct')");
            feedback = scanner.nextLine().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number.");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }

        scanner.close();
    }
}
