package Day3.Reflections.Advanced;
import java.lang.reflect.Field;
import java.util.Map;

class User {
    public String name;
    public int age;
}

public class Main8 {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> props) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Field field : clazz.getDeclaredFields()) {
            if (props.containsKey(field.getName())) {
                field.setAccessible(true);
                field.set(obj, props.get(field.getName()));
            }
        }
        return obj;
    }
}
