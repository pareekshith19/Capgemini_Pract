import java.io.*;
import java.util.*;
import java.util.regex.*;

public class problem1 {

    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordCount;
    }

    public static void main(String[] args) throws IOException {
        String text = "Hello world, hello Java!";
        Map<String, Integer> wordFrequency = countWordFrequency(text);
        System.out.println(wordFrequency);
    }
}
