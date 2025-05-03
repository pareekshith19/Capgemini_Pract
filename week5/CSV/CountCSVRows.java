package Day1;
import java.io.*;
public class CountCSVRows {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                count++;
            }
            System.out.println("Number of records: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
