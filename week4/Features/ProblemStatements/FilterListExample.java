package Day5.ProblemStatements;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterListExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Angela");
        List<String> filteredNames = names.stream()
                .filter(name -> !name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
