import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.printf("%d is an even number\n", i);
                } else {
                    System.out.printf("%d is an odd number\n", i);
                }
            }
        }
        sc.close();
    }
    
}
