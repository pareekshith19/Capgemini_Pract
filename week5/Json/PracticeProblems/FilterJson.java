package Day2.PracticeProblems;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterJson {
    public static void main(String[] args) {
        String json = "[{\"name\":\"Alice\",\"age\":22},{\"name\":\"Bob\",\"age\":30}]";
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode array = objectMapper.readTree(json);
            for (JsonNode node : array) {
                if (node.get("age").asInt() > 25) {
                    System.out.println(node.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
