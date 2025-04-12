import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("output.txt")) {

            String input;
            System.out.println("Enter text (type 'exit' to finish):");
            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(input + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}