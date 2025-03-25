import java.util.Scanner;

public class problem2 {
    public static String createSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        String result1 = createSubstring(s, start, end);
        String result2 = s.substring(start, end);
        System.out.println(result1.equals(result2));
        scanner.close();
    }
}
