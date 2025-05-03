package Day3.Reflections.Advanced;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

class Service {
    public void execute() {
        System.out.println("Service executed");
    }
}

class Controller {
    @Inject
    private Service service;

    public void run() {
        service.execute();
    }
}

public class Main11 {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        for (Field field : Controller.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(controller, new Service());
            }
        }
        controller.run();
    }
}

