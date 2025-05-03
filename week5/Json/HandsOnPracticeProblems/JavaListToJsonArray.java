package Day2.HandsOnPracticeProblems;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.Arrays;

class User {
    public String name;
    public int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class JavaListToJsonArray {
    public static void main(String[] args) {
        try {
            List<User> users = Arrays.asList(new User("Tom", 27), new User("Jerry", 23));
            ObjectMapper mapper = new ObjectMapper();
            String jsonArray = mapper.writeValueAsString(users);
            System.out.println(jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
