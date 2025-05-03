package Day2.HandsOnPracticeProblems;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterJsonByAge {
    public static void main(String[] args) {
        String json = "[{\"name\":\"Tom\",\"age\":27},{\"name\":\"Jerry\",\"age\":23}]";
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode array = mapper.readTree(json);
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
