import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        System.out.println("Longest word: " + findLongestWord(sentence));
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+"); // Split by spaces
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }
}
