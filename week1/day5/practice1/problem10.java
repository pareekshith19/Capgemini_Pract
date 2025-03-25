import java.util.Scanner;

public class problem10 {
    public static String toLower(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            result += (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result1 = toLower(s);
        String result2 = s.toLowerCase();
        System.out.println(result1.equals(result2));
        scanner.close();
    }
}
