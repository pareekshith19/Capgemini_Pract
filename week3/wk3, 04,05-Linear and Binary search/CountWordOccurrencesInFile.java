import java.io.*;

public class CountWordOccurrencesInFile {
    public static void main(String[] args) {
        String target = "java";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String word : line.split("\\s+")) {
                    if (word.equalsIgnoreCase(target)) {
                        count++;
                    }
                }
            }
            System.out.println("Occurrences of '" + target + "': " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}