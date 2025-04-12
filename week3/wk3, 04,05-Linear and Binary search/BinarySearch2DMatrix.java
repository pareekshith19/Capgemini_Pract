public class BinarySearch2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };
        int target = 9;
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = matrix[mid / cols][mid % cols];
            if (midVal == target) {
                System.out.println("Found: true");
                return;
            } else if (target < midVal) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Found: false");
    }
}