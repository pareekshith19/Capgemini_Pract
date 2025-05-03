package Day1;
import java.io.*;
import java.util.*;

public class UpdateITSalary {
    public static void main(String[] args) {
        String inputFile = "employees.csv";
        String outputFile = "updated_employees.csv";
        List<String> updatedLines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String header = br.readLine();
            updatedLines.add(header);
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                if (columns[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(columns[3]);
                    salary *= 1.1;
                    columns[3] = String.valueOf((int) salary);
                }
                updatedLines.add(String.join(",", columns));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            for (String updatedLine : updatedLines) {
                bw.write(updatedLine);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
