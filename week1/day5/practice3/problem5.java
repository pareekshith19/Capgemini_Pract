import java.util.Scanner;

public class problem5 {
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;
        
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }
        
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];
        int length = text.length();
        
        for (int i = 0; i < length; i++) {
            frequency[text.charAt(i)]++;
        }
        
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(frequency[uniqueChars[i]]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();
        
        String[][] frequencyData = findCharacterFrequency(input);
        System.out.println("Character | Frequency");
        for (String[] row : frequencyData) {
            System.out.println("    " + row[0] + "     |    " + row[1]);
        }
    }
    
}
