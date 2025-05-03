package Day3.Annotations.Advanced;
import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class UserJson {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_email")
    private String email;

    public UserJson(String username, String email) {
        this.username = username;
        this.email = email;
    }
}

public class Main6 {
    public static void main(String[] args) throws Exception {
        UserJson user = new UserJson("john", "john@example.com");
        StringBuilder json = new StringBuilder("{");
        for (Field field : UserJson.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField jf = field.getAnnotation(JsonField.class);
                json.append("\"").append(jf.name()).append("\":\"")
                        .append(field.get(user)).append("\",");
            }
        }
        if (json.charAt(json.length() - 1) == ',') json.setLength(json.length() - 1);
        json.append("}");
        System.out.println(json.toString());
    }
}
