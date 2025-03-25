import java.util.Scanner;

public class problem7 {
    public static void generateException(String s) {
        int num = Integer.parseInt(s);
        System.out.println(num);
    }

    public static void handleException(String s) {
        try {
            int num = Integer.parseInt(s);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        // generateException(s);
        handleException(s);
        scanner.close();
    }
    
}
