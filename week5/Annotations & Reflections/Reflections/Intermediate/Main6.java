package Day3.Reflections.Intermediate;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

@Author(name = "Jane Doe")
class Document {}

public class Main6 {
    public static void main(String[] args) {
        if (Document.class.isAnnotationPresent(Author.class)) {
            Author a = Document.class.getAnnotation(Author.class);
            System.out.println("Author: " + a.name());
        }
    }
}
