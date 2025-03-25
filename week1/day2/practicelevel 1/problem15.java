import java.util.Scanner;

public class problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long factorial = 1;

        if (num < 0) {
            System.out.println("The number is not a natural number");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.printf("The factorial of %d is %d\n", num, factorial);
        }
        sc.close();
    }
}
