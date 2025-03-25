import java.util.Scanner;

public class problem10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double value = -1;
        while (value != 0){
            value = sc.nextDouble();
            total = total + value;
        }
        System.out.printf("%f",total);
        sc.close();
    }
    
}
