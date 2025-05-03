package Day1;
import java.io.*;
import java.util.*;

public class DetectDuplicatesCSV {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        Set<String> ids = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                if (!ids.add(columns[0])) {
                    System.out.println("Duplicate Record: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
