import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print((j == 0 ? "Physics" : (j == 1 ? "Chemistry" : "Maths")) + ": ");
                    marks[i][j] = scanner.nextInt();
                    if (marks[i][j] < 0) {
                        System.out.println("Marks cannot be negative. Please re-enter.");
                    }
                } while (marks[i][j] < 0);
            }
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            grades[i] = calculateGrade(percentages[i]);
        }

        System.out.println("\nStudent Results:");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s %-5s\n", "Physics", "Chemistry", "Maths", "Total", "Percentage", "Grade");
        System.out.println("----------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.printf("%-10d %-10d %-10d %-10d %-15.2f %-5c\n", marks[i][0], marks[i][1], marks[i][2], total, percentages[i], grades[i]);
        }

        scanner.close();
    }

    public static char calculateGrade(double percentage) {
        if (percentage >= 80) {
            return 'A';
        } else if (percentage >= 70) {
            return 'B';
        } else if (percentage >= 60) {
            return 'C';
        } else if (percentage >= 50) {
            return 'D';
        } else if (percentage >= 40) {
            return 'E';
        } else {
            return 'R';
        }
    }
}