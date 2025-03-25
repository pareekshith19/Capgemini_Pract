import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();


        if (number <= 0) {
            System.out.println("Error: Please enter a positive natural number.");
            System.exit(0);
        }


        int[] evenArray = new int[number / 2 + 1];
        int[] oddArray = new int[number / 2 + 1];


        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {

                evenArray[evenIndex] = i;
                evenIndex++;
            } else {

                oddArray[oddIndex] = i;
                oddIndex++;
            }
        }

        System.out.print("Even numbers: [");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArray[i]);
            if (i < evenIndex - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("Odd numbers: [");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArray[i]);
            if (i < oddIndex - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        scanner.close();
    }
}