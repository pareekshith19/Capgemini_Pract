package Day3.Annotations.Advanced;
import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class ExpensiveCalculator {
    private final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int compute(int x) {
        if (cache.containsKey(x)) {
            return cache.get(x);
        }
        int result = x * x; // Simulate expensive operation
        cache.put(x, result);
        return result;
    }
}

public class Main7 {
    public static void main(String[] args) throws Exception {
        ExpensiveCalculator calc = new ExpensiveCalculator();
        Method method = ExpensiveCalculator.class.getMethod("compute", int.class);
        if (method.isAnnotationPresent(CacheResult.class)) {
            System.out.println(calc.compute(10));
            System.out.println(calc.compute(10));
        }
    }
}
