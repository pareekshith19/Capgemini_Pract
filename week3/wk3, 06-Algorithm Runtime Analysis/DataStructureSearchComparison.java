import java.util.*;

public class DataStructureSearchComparison {
    public static void main(String[] args) {
        int N = 1_000_000;
        int target = N - 1;

        int[] array = new int[N];
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long start = System.nanoTime();
        for (int val : array) {
            if (val == target) break;
        }
        System.out.println("Array Search: " + (System.nanoTime() - start) / 1e6 + " ms");

        start = System.nanoTime();
        hashSet.contains(target);
        System.out.println("HashSet Search: " + (System.nanoTime() - start) / 1e6 + " ms");

        start = System.nanoTime();
        treeSet.contains(target);
        System.out.println("TreeSet Search: " + (System.nanoTime() - start) / 1e6 + " ms");
    }
}