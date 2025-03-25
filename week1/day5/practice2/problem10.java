import java.util.Random;

public class problem10 {
    public static int[][] generateScores(int students) {
        Random random = new Random();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = 40 + random.nextInt(61);
            scores[i][1] = 40 + random.nextInt(61);
            scores[i][2] = 40 + random.nextInt(61);
        }
        return scores;
    }

    public static double[][] calculatePercentage(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round(average * 100.0) / 100.0;
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = percentage;
        }
        return stats;
    }

    public static String[] assignGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];
            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    public static void displayResults(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("\nStudent Scorecard:");
        System.out.println("ID\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" + 
                               (int)stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "%\t\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
        int students = 5;
        int[][] scores = generateScores(students);
        double[][] stats = calculatePercentage(scores);
        String[] grades = assignGrades(stats);
        displayResults(scores, stats, grades);
    }
}
