import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        System.out.printf("Each child gets %d chocolates, and the remaining chocolates are %d%n",
                chocolatesPerChild, remainingChocolates);

        scanner.close();
    }
    
}
