import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        System.out.println("Most Frequent Character: '" + findMostFrequentCharacter(str) + "'");
    }

    public static char findMostFrequentCharacter(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        char mostFrequent = ' ';
        int maxCount = 0;

        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            if (charCount.get(ch) > maxCount) {
                maxCount = charCount.get(ch);
                mostFrequent = ch;
            }
        }

        return mostFrequent;
    }
}
