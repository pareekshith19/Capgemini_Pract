public class FindRotationPointBinarySearch {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 1, 2, 3, 4};
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        System.out.println("Rotation point at index: " + left);
    }
}