import java.util.Scanner;
public class problem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        System.out.printf("Is the first number the smallest? %b ",(number1<number2 && number1<number3));
        sc.close();
    }
    
}
