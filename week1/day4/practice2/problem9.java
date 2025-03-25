import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is positive and even.");
                } else {
                    System.out.println(number + " is positive and odd.");
                }
            } else {
                System.out.println(number + " is negative or zero.");
            }
        }

        if (numbers.length >= 2) {
            if (numbers[0] > numbers[numbers.length - 1]) {
                System.out.println("The first element (" + numbers[0] + ") is greater than the last element (" + numbers[numbers.length - 1] + ").");
            } else if (numbers[0] == numbers[numbers.length - 1]) {
                System.out.println("The first element (" + numbers[0] + ") is equal to the last element (" + numbers[numbers.length - 1] + ").");
            } else {
                System.out.println("The first element (" + numbers[0] + ") is less than the last element (" + numbers[numbers.length - 1] + ").");
            }
        } else {
            System.out.println("Not enough elements to compare the first and last.");
        }
        scanner.close();
    }
}