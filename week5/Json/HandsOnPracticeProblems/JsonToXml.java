package Day2.HandsOnPracticeProblems;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXml {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"age\":30}";
        try {
            ObjectMapper jsonMapper = new ObjectMapper();
            JsonNode node = jsonMapper.readTree(json);
            XmlMapper xmlMapper = new XmlMapper();
            String xml = xmlMapper.writeValueAsString(node);
            System.out.println(xml);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
