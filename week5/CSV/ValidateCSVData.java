package Day1;
import java.io.*;
import java.util.regex.*;

public class ValidateCSVData {
    public static void main(String[] args) {
        String filePath = "contacts.csv";
        Pattern emailPattern = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
        Pattern phonePattern = Pattern.compile("^\\d{10}$");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String header = br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                Matcher emailMatcher = emailPattern.matcher(columns[2]);
                Matcher phoneMatcher = phonePattern.matcher(columns[3]);
                if (!emailMatcher.matches()) {
                    System.out.println("Invalid Email for: " + columns[0]);
                }
                if (!phoneMatcher.matches()) {
                    System.out.println("Invalid Phone Number for: " + columns[0]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
