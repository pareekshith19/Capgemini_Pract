import java.util.HashSet;

public class RemoveDuplicatesWithStringBuilder {
    public static void main(String[] args) {
        String input = "programming";
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }

        System.out.println("Without Duplicates: " + sb.toString());
    }
}