import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] nums = new double[10];
        double sum = 0;
        int i = 0;
        while (true) {
            System.out.print("Enter numbers (0 or negative to stop): ");
            double num = input.nextDouble();
            if (num <= 0 || i == 10) {
                break;
            }
            nums[i++] = num;
        }
        for (int j = 0; j < i; j++) {
            System.out.println(nums[j]);
            sum += nums[j];
        }
        System.out.println("Sum: " + sum);
        input.close();
    }
}
