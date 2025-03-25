import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int handshakes = calculateHandshakes(numStudents);

        System.out.println("Maximum number of handshakes: " + handshakes);

        scanner.close();
    }

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}