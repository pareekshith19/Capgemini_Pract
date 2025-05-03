package Day2.PracticeProblems;
import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJson {
    public static void main(String[] args) {
        JSONArray subjects = new JSONArray();
        subjects.put("Math");
        subjects.put("Science");
        subjects.put("History");

        JSONObject student = new JSONObject();
        student.put("name", "John Doe");
        student.put("age", 20);
        student.put("subjects", subjects);

        System.out.println(student.toString());
    }
}
