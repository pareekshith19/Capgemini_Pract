package Day3.Reflections.Basic;
import java.lang.reflect.Constructor;

class Student {
    public Student() {
        System.out.println("Student created");
    }
}

public class Main4 {
    public static void main(String[] args) throws Exception {
        Constructor<Student> constructor = Student.class.getConstructor();
        Student s = constructor.newInstance();
    }
}
