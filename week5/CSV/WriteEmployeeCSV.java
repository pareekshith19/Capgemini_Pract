package Day1;
import java.io.*;
public class WriteEmployeeCSV {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("ID,Name,Department,Salary\n");
            writer.write("301,Robert King,Sales,55000\n");
            writer.write("302,Linda Green,HR,60000\n");
            writer.write("303,David Clark,Engineering,75000\n");
            writer.write("304,Emma Lewis,Marketing,58000\n");
            writer.write("305,James Hall,Finance,62000\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
