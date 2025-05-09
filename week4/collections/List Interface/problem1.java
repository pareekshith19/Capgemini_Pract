import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class problem1 {

    public static <T> List<T> reverseList(List<T> originalList) {
        List<T> reversedList = new ArrayList<>();
        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }
        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println(arrayList);
        List<Integer> reversedArrayList = reverseList(arrayList);
        System.out.println(reversedArrayList);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println(linkedList);
        List<Integer> reversedLinkedList = reverseList(linkedList);
        System.out.println(reversedLinkedList);
    }
}
