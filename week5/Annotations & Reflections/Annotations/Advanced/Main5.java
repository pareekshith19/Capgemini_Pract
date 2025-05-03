package Day3.Annotations.Advanced;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class SecureService {
    @RoleAllowed("ADMIN")
    public void secureAction() {
        System.out.println("Secure action performed");
    }
}

public class Main5 {
    public static void main(String[] args) throws Exception {
        String userRole = "USER";
        SecureService service = new SecureService();
        for (Method method : SecureService.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed ra = method.getAnnotation(RoleAllowed.class);
                if (ra.value().equals(userRole)) {
                    method.invoke(service);
                } else {
                    System.out.println("Access Denied!");
                }
            }
        }
    }
}
