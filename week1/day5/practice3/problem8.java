import java.util.Scanner;

public class problem8 {
    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) return false;
        
        int[] frequency = new int[256];
        
        for (int i = 0; i < text1.length(); i++) {
            frequency[text1.charAt(i)]++;
            frequency[text2.charAt(i)]--;
        }
        
        for (int count : frequency) {
            if (count != 0) return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String text1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String text2 = sc.nextLine();
        sc.close();
        
        System.out.println("Are the two texts anagrams? " + areAnagrams(text1, text2));
    }
    
}
