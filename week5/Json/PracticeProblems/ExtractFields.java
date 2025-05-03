package Day2.PracticeProblems;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ExtractFields {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode node = objectMapper.readTree(new File("user.json"));
            System.out.println("Name: " + node.get("name").asText());
            System.out.println("Email: " + node.get("email").asText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
