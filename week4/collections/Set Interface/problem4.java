import java.util.*;

public class problem4 {

    public static List<Integer> convertAndSortSet(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println(convertAndSortSet(set));
    }
}
