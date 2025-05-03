package Day2.HandsOnPracticeProblems;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class DbTOJsonReport {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, name, age FROM users");
            List<Map<String, Object>> list = new ArrayList<>();
            while (rs.next()) {
                Map<String, Object> map = new HashMap<>();
                map.put("id", rs.getInt("id"));
                map.put("name", rs.getString("name"));
                map.put("age", rs.getInt("age"));
                list.add(map);
            }
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(list);
            System.out.println(json);
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
