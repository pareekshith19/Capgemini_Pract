package Day3.Regex.ExtractionProblems;
import java.util.regex.*;
public class CapitalisedWordExtractor {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String regex = "\\b[A-Z][a-z]+\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Capitalized Word: " + matcher.group());
        }
    }
}
