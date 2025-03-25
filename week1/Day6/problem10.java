import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        System.out.println("Modified String: " + removeCharacter(str, ch));
    }

    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != ch) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
