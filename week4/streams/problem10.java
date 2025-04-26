import java.io.*;
import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    word = word.toLowerCase();
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

            wordCount.entrySet().stream()
                    .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                    .limit(5)
                    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
