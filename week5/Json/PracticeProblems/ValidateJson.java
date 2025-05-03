package Day2.PracticeProblems;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"Bob\",\"age\":30}";
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.readTree(json);
            System.out.println("Valid JSON");
        } catch (Exception e) {
            System.out.println("Invalid JSON");
        }
    }
}
