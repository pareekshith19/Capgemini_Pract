import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int greatfactor = 1;
        int i = number - 1;

        while (i >= 1) {
            if (number % i == 0 && i > greatfactor) {
                greatfactor = i;
            }
            i--;
        }

        System.out.printf("The factor of %d is %d", number, greatfactor);
        sc.close();
    }

    
}
