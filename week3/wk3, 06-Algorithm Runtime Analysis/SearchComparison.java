import java.util.Arrays;

public class SearchComparison {
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return true;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int N = 1_000_000;
        int[] data = new int[N];
        for (int i = 0; i < N; i++) data[i] = i;

        int target = 999_999;

        long start = System.nanoTime();
        linearSearch(data, target);
        System.out.println("Linear Search Time: " + (System.nanoTime() - start) / 1e6 + " ms");

        Arrays.sort(data);
        start = System.nanoTime();
        binarySearch(data, target);
        System.out.println("Binary Search Time: " + (System.nanoTime() - start) / 1e6 + " ms");
    }
}