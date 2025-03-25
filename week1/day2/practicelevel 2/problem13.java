import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            int counter = 100;

            while (counter > 1) {
                counter--;
                if (counter % number == 0) {
                    System.out.println(counter);
                }
            }
        } else {
            System.out.println("Enter a number between 1 and 99.");
        }
        sc.close();
    }
    
}
