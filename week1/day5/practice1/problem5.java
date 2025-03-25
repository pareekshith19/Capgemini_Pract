import java.util.Scanner;

public class problem5 {
    public static void generateException(String s) {
        System.out.println(s.charAt(s.length()));
    }

    public static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught");
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
