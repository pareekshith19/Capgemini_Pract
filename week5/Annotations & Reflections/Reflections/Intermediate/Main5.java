package Day3.Reflections.Intermediate;
import java.lang.reflect.Method;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

public class Main5 {
    public static void main(String[] args) throws Exception {
        MathOperations obj = new MathOperations();
        String methodName = "add";
        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
        System.out.println("Result: " + method.invoke(obj, 5, 3));
    }
}
