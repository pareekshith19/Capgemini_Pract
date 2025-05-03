package Day3.Reflections.Basic;
import java.lang.reflect.*;

public class Main1 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.util.ArrayList");
        for (Method m : clazz.getDeclaredMethods()) System.out.println("Method: " + m.getName());
        for (Field f : clazz.getDeclaredFields()) System.out.println("Field: " + f.getName());
        for (Constructor<?> c : clazz.getDeclaredConstructors()) System.out.println("Constructor: " + c);
    }
}
