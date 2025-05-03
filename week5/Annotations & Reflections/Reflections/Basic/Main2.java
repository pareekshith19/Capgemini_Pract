package Day3.Reflections.Basic;
import java.lang.reflect.Field;

class Person {
    private int age = 25;
}

public class Main2 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);
        field.set(p, 30);
        System.out.println("Age: " + field.get(p));
    }
}
