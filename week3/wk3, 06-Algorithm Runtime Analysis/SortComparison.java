import java.util.Arrays;

public class SortComparison {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int N = 100_000;
        int[] bubble = new int[N];
        int[] merge = new int[N];
        int[] quick = new int[N];

        for (int i = 0; i < N; i++) {
            bubble[i] = merge[i] = quick[i] = (int) (Math.random() * N);
        }

        long start = System.nanoTime();
        bubbleSort(bubble);
        System.out.println("Bubble Sort: " + (System.nanoTime() - start) / 1e6 + " ms");

        start = System.nanoTime();
        Arrays.sort(merge); // Uses dual-pivot QuickSort or MergeSort
        System.out.println("Merge Sort (via Arrays.sort): " + (System.nanoTime() - start) / 1e6 + " ms");

        start = System.nanoTime();
        Arrays.sort(quick);
        System.out.println("Quick Sort (via Arrays.sort): " + (System.nanoTime() - start) / 1e6 + " ms");
    }
}