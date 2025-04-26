import java.io.*;
import java.util.List;

public class Problem1 {
    public static void processFiles(List<String> filePaths) {
        for (String filePath : filePaths) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + filePath + " - " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        processFiles(List.of("file1.txt", "file2.txt"));
    }
}
