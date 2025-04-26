import java.io.*;

public class Problem4 {
    public static void main(String[] args) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader("file1.txt"));
             BufferedReader reader2 = new BufferedReader(new FileReader("file2.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            String line;
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
