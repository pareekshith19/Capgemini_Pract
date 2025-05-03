package Day3.Reflections.Advanced;
import java.lang.reflect.*;

interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello");
    }
}

public class Main10 {
    public static void main(String[] args) {
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                (proxyObj, method, args1) -> {
                    System.out.println("Calling: " + method.getName());
                    return method.invoke(new GreetingImpl(), args1);
                }
        );
        proxy.sayHello();
    }
}
