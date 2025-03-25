import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainStr = scanner.nextLine();
        System.out.print("Enter the substring to count: ");
        String subStr = scanner.nextLine();
        scanner.close();

        System.out.println("Occurrences of substring: " + countOccurrences(mainStr, subStr));
    }

    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = mainStr.indexOf(subStr);

        while (index != -1) {
            count++;
            index = mainStr.indexOf(subStr, index + subStr.length());
        }

        return count;
    }
}
