package Day3.Reflections.Intermediate;
import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "OLD_KEY";
}

public class Main7 {
    public static void main(String[] args) throws Exception {
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);
        field.set(null, "NEW_KEY");
        System.out.println("API_KEY: " + field.get(null));
    }
}
