package Day1;
import java.sql.*;
import java.io.*;

public class DatabaseToCSV {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_db";
        String user = "username";
        String password = "password";
        String csvFile = "employees_report.csv";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, name, department, salary FROM employees");
             BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))) {

            writer.write("Employee ID,Name,Department,Salary\n");

            while (rs.next()) {
                String line = rs.getString("id") + "," +
                        rs.getString("name") + "," +
                        rs.getString("department") + "," +
                        rs.getString("salary") + "\n";
                writer.write(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
