import java.util.Scanner;

class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int temp = number;
        int digitCount = 0;
        while (temp != 0) {
            temp /= 10;
            digitCount++;
        }
        int[] digits = new int[digitCount];
        temp = number;
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        System.out.print("Reversed number: ");
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        System.out.println();
        scanner.close();
    }
}