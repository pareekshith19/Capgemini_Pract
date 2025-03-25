import java.util.Scanner;

public class problem1 {
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        boolean result1 = compareStrings(s1, s2);
        boolean result2 = s1.equals(s2);
        System.out.println(result1 == result2);
        scanner.close();
    }
    
}
