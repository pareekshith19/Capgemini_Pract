import java.util.Scanner;

public class problem6 {
    public static void generateException(String s, int start, int end) {
        System.out.println(s.substring(end, start));
    }

    public static void handleException(String s, int start, int end) {
        try {
            System.out.println(s.substring(end, start));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        handleException(s, start, end);
        scanner.close();
    }
    
}
