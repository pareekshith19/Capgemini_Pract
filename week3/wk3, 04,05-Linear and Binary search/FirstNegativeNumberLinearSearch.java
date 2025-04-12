public class FirstNegativeNumberLinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, -2, 8, 6};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println("First negative number at index: " + i);
                return;
            }
        }
        System.out.println("No negative numbers found.");
    }
}