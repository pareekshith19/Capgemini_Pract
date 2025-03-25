import java.util.Scanner;

public class problem7 {
    public static int[] findTrimIndices(String str) {
        int start = 0, end = str.length() - 1;

        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1};
    }

    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();
        scanner.close();

        int[] indices = findTrimIndices(input);
        String trimmedCustom = customSubstring(input, indices[0], indices[1]);
        String trimmedBuiltIn = input.trim();

        System.out.println("Custom Trimmed String: \"" + trimmedCustom + "\"");
        System.out.println("Built-in Trimmed String: \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both equal? " + compareStrings(trimmedCustom, trimmedBuiltIn));
    }
}
