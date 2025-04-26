import java.io.*;

public class Problem6 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            int charRead;
            while ((charRead = reader.read()) != -1) {
                writer.write(Character.toLowerCase((char) charRead));
            }

            System.out.println("File content converted to lowercase.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
