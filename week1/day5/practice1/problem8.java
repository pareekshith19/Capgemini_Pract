import java.util.Scanner;

public class problem8 {
    public static void generateException(String[] arr, int index) {
        System.out.println(arr[index]);
    }

    public static void handleException(String[] arr, int index) {
        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.next();
        }
        int index = scanner.nextInt();
        // generateException(arr, index);
        handleException(arr, index);
        scanner.close();
    }
    
}
