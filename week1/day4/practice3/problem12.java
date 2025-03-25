import java.util.Random;
import java.util.Scanner;

public class problem12 {

    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        Random random = new Random();

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(100); // Generate scores between 0 and 99
            }
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double) total / 3;
            double percentage = (average * 100) / 100; // Assuming total marks per subject is 100

            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade\tRemarks");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Student %d\t%d\t%d\t%d\t%.2f\t%.2f\t%.2f\t%s\t%s\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2],
                    getGrade(results[i][2]), getRemarks(results[i][2]));
        }
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }

    public static String getRemarks(double percentage) {
        if (percentage >= 80) {
            return "(Level 4, above agency-normalized standards)";
        } else if (percentage >= 70) {
            return "(Level 3, at agency-normalized standards)";
        } else if (percentage >= 60) {
            return "(Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50) {
            return "(Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40) {
            return "(Level 1-, too below agency-normalized standards)";
        } else {
            return "(Remedial standards)";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.close();

        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}