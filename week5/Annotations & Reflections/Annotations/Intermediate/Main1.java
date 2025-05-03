package Day3.Annotations.Intermediate;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

class Service {
    @ImportantMethod
    public void start() {
        System.out.println("Start service");
    }

    @ImportantMethod(level = "MEDIUM")
    public void stop() {
        System.out.println("Stop service");
    }
}

public class Main1 {
    public static void main(String[] args) {
        for (Method method : Service.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Level: " + im.level());
            }
        }
    }
}
