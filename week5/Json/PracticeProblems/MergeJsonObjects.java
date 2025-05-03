package Day2.PracticeProblems;
import org.json.JSONObject;

public class MergeJsonObjects {
    public static void main(String[] args) {
        JSONObject json1 = new JSONObject();
        json1.put("name", "Alice");
        json1.put("age", 25);

        JSONObject json2 = new JSONObject();
        json2.put("email", "alice@example.com");
        json2.put("city", "New York");

        JSONObject merged = new JSONObject(json1.toString());
        for (String key : json2.keySet()) {
            merged.put(key, json2.get(key));
        }

        System.out.println(merged.toString());
    }
}
