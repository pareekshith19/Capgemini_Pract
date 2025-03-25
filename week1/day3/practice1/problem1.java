import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age");
            } else if (ages[i] < 18) {
                System.out.println("Not eligible as age is " + ages[i]);
            } else {
                System.out.println("Eligible as age is " + ages[i]);
            }
        }
    }
}