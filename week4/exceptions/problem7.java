import java.io.*;

public class Problem7 {
    public static void processConnection() throws IOException {
        throw new IOException("Error processing connection");
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            processConnection();
        } catch (IOException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
