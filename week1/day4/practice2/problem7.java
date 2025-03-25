import java.util.Scanner;
public class problem7 {
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        } else if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
            boolean canVote = canStudentVote(studentAges[i]);
            System.out.println("Student " + (i + 1) + " can vote: " + canVote);
        }
        scanner.close();
    }
}