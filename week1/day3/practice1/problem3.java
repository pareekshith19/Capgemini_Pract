import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        int[] table = new int[10];

        for(int i =0;i<10;i++){
            table[i] = number * (i+1);
        }
        for(int i = 0;i<10;i++)
        {
            System.out.println(number + " * " + (i +1) + " = "+ table[i]);
        }

    }
}
