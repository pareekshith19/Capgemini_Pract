import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        System.out.println("String after removing duplicates: " + removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (seen.add(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
