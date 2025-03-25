import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = scanner.next();
        System.out.print("Enter new word: ");
        String newWord = scanner.next();
        scanner.close();

        System.out.println("Modified Sentence: " + replaceWord(sentence, oldWord, newWord));
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }
}
