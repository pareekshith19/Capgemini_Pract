package Day3.Annotations.Intermediate;
import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        for (Field field : this.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength max = field.getAnnotation(MaxLength.class);
                if (username.length() > max.value()) {
                    throw new IllegalArgumentException("Username exceeds max length");
                }
            }
        }
        this.username = username;
    }
}

public class Main4 {
    public static void main(String[] args) {
        new User("shortname");
        // new User("thisusernameiswaytoolong");
    }
}
