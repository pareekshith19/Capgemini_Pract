import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] employeeIds = new int[n];

        for (int i = 0; i < n; i++) {
            employeeIds[i] = scanner.nextInt();
        }

        insertionSort(employeeIds);

        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
