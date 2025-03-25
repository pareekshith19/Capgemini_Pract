import java.util.Scanner;

public class problem4 {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] customSplit(String str) {
        int length = findLength(str);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndexes = new int[spaceCount + 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length;

        String[] words = new String[spaceCount + 1];
        int start = 0;
        for (int i = 0; i <= spaceCount; i++) {
            int end = spaceIndexes[i];
            words[i] = str.substring(start, end);
            start = end + 1;
        }
        return words;
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static String[] findShortestAndLongest(String[][] wordLengths) {
        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];
        int minLength = Integer.parseInt(wordLengths[0][1]);
        int maxLength = minLength;

        for (String[] row : wordLengths) {
            int length = Integer.parseInt(row[1]);
            if (length < minLength) {
                minLength = length;
                shortest = row[0];
            }
            if (length > maxLength) {
                maxLength = length;
                longest = row[0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] words = customSplit(input);
        String[][] wordLengths = getWordLengths(words);
        String[] result = findShortestAndLongest(wordLengths);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
    
}
