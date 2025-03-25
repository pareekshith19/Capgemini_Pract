import java.util.Scanner;

public class problem9 {
    public static String toUpper(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            result += (ch >= 'a' && ch <= 'z') ? (char) (ch - 32) : ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result1 = toUpper(s);
        String result2 = s.toUpperCase();
        System.out.println(result1.equals(result2));
        scanner.close();
    }
    
}
