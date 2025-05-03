package Day3.Annotations.Intermediate;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {
    @Todo(task = "Implement login", assignedTo = "Bob")
    public void login() {}

    @Todo(task = "Fix payment bug", assignedTo = "Alice", priority = "HIGH")
    public void payment() {}
}

public class Main2 {
    public static void main(String[] args) {
        for (Method method : Project.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Task: " + todo.task() + ", Assigned To: " + todo.assignedTo() + ", Priority: " + todo.priority());
            }
        }
    }
}
