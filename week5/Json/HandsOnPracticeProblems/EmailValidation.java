package Day2.HandsOnPracticeProblems;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

public class EmailValidation {
    public static void main(String[] args) {
        String schemaStr = "{ \"type\": \"object\", \"properties\": { \"email\": { \"type\": \"string\", \"format\": \"email\" } }, \"required\": [\"email\"] }";
        String dataStr = "{ \"email\": \"test@example.com\" }";
        try {
            JSONObject rawSchema = new JSONObject(new JSONTokener(schemaStr));
            Schema schema = SchemaLoader.load(rawSchema);
            JSONObject data = new JSONObject(new JSONTokener(dataStr));
            schema.validate(data);
            System.out.println("Valid email.");
        } catch (Exception e) {
            System.out.println("Invalid email.");
        }
    }
}
