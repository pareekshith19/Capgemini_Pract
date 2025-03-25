import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        String str = getInput("Enter a string: ");
        System.out.println(str + " is " + (isPalindrome(str) ? "a palindrome." : "not a palindrome."));
    }
    public static String getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}