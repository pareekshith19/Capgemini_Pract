import java.util.Scanner;

public class problem6 {
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();
        int length = characters.length;
        int[] frequency = new int[length];
        
        for (int i = 0; i < length; i++) {
            frequency[i] = 1;
            if (characters[i] == '0') continue;
            
            for (int j = i + 1; j < length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0';
                }
            }
        }
        
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') uniqueCount++;
        }
        
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                result[index++] = characters[i] + " - " + frequency[i];
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();
        
        String[] frequencyData = findCharacterFrequency(input);
        System.out.println("Character | Frequency");
        for (String entry : frequencyData) {
            System.out.println(entry);
        }
    }
    
}
