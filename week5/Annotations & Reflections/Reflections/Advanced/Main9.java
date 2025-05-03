package Day3.Reflections.Advanced;
import java.lang.reflect.Field;

class Product {
    public String name = "Book";
    public double price = 9.99;
}

public class Main9 {
    public static void main(String[] args) throws Exception {
        Product product = new Product();
        StringBuilder json = new StringBuilder("{");
        for (Field field : Product.class.getDeclaredFields()) {
            field.setAccessible(true);
            json.append("\"").append(field.getName()).append("\":\"").append(field.get(product)).append("\",");
        }
        if (json.charAt(json.length() - 1) == ',') json.setLength(json.length() - 1);
        json.append("}");
        System.out.println(json);
    }
}
