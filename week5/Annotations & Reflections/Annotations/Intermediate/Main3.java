package Day3.Annotations.Intermediate;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class Processor {
    @LogExecutionTime
    public void fastTask() {
        for (int i = 0; i < 1000; i++);
    }

    @LogExecutionTime
    public void slowTask() {
        for (int i = 0; i < 1000000; i++);
    }
}

public class Main3 {
    public static void main(String[] args) throws Exception {
        Processor processor = new Processor();
        for (Method method : Processor.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                method.invoke(processor);
                long end = System.nanoTime();
                System.out.println(method.getName() + " executed in " + (end - start) + " ns");
            }
        }
    }
}
