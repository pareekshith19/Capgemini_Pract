import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.print("Factors of " + number + " are: ");
            int i = 1;
            while (i <= number) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        sc.close();
    }
    
}
