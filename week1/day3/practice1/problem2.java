import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbs = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number : " + (i + 1));
            numbs[i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (numbs[i] < 0) {
                System.out.println("number is negative");
            } else if (numbs[i] == 0) {
                System.out.println("Number is zero");
            } else {
                if (numbs[i] % 2 == 0) {
                    System.out.println("Number is positive and even " + numbs[i]);
                } else {
                    System.out.println("Number is positive and odd " + numbs[i]);
                }
            }
        }
    }
}