import java.util.Scanner;

public class problem3 {
    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256];
        int length = 0;
        
        try {
            while (text.charAt(length) != '\0') {
                length++;
            }
        } catch (Exception e) {}
        
        for (int i = 0; i < length; i++) {
            frequency[text.charAt(i)]++;
        }
        
        for (int i = 0; i < length; i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();
        
        char result = findFirstNonRepeatingChar(input);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
