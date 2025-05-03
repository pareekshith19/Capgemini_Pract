package Day1;
import java.io.*;
import java.util.Scanner;

public class SearchEmployee {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                if (columns[1].equalsIgnoreCase(searchName)) {
                    System.out.println("Department: " + columns[2] + ", Salary: " + columns[3]);
                    return;
                }
            }
            System.out.println("Employee not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
