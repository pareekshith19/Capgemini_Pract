import java.util.Scanner;

public class problem4 {
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];
        int length = 0;
        
        try {
            while (text.charAt(length) != '\0') {
                frequency[text.charAt(length)]++;
                length++;
            }
        } catch (Exception e) {}
        
        String[][] result = new String[length][2];
        int index = 0;
        
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] > 0) {
                result[index][0] = Character.toString(currentChar);
                result[index][1] = Integer.toString(frequency[currentChar]);
                frequency[currentChar] = 0;
                index++;
            }
        }
        
        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }
        
        return finalResult;
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
