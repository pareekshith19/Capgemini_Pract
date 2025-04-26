import java.util.*;

public class problem3 {

    public static <T> List<T> rotateList(List<T> list, int positions) {
        int size = list.size();
        List<T> rotated = new ArrayList<>();
        positions = positions % size;
        for (int i = positions; i < size; i++) {
            rotated.add(list.get(i));
        }
        for (int i = 0; i < positions; i++) {
            rotated.add(list.get(i));
        }
        return rotated;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(10, 20, 30, 40, 50);
        int rotateBy = 2;
        List<Integer> result = rotateList(input, rotateBy);
        System.out.println(result);
    }
}
