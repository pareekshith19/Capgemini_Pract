import java.util.Scanner;

public class problem9 {
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        int index = (int) (Math.random() * 3);
        return choices[index];
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Scissors") && computer.equals("Paper")) ||
            (user.equals("Paper") && computer.equals("Rock"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[3][2];
        stats[0][0] = "User Wins"; stats[0][1] = String.valueOf(userWins);
        stats[1][0] = "Computer Wins"; stats[1][1] = String.valueOf(computerWins);
        stats[2][0] = "Win %"; 
        stats[2][1] = String.format("%.2f%%", (userWins * 100.0) / totalGames);
        return stats;
    }

    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser Choice\tComputer Choice\tWinner");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        System.out.println("\nGame Statistics:");
        for (String[] row : stats) {
            System.out.println(row[0] + ": " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of games: ");
        int numGames = scanner.nextInt();
        scanner.nextLine();

        String[][] results = new String[numGames][3];
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < numGames; i++) {
            System.out.print("Enter Rock, Paper, or Scissors: ");
            String userChoice = scanner.nextLine().trim();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;

            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
        }

        scanner.close();
        String[][] stats = calculateStats(userWins, computerWins, numGames);
        displayResults(results, stats);
    }
}
