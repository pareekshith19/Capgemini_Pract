import java.util.*;

public class problem5 {

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) return null;
            first.next();
        }
        while (first.hasNext()) {
            first.next();
            second.next();
        }
        return second.next();
    }

    public static void main(String[] args) {
        LinkedList<String> input = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;
        String result = findNthFromEnd(input, n);
        System.out.println(result);
    }
}
