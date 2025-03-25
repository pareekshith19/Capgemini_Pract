import java.util.Scanner;

public class problem9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int greatfactor = 1;
        for (int i = number - 1;i>=1;i--){
            if(number%i==0 && i >greatfactor){
                greatfactor = i;
            }
        }
        System.out.printf("the factor of %d is %d",number,greatfactor);
        sc.close();
    }
    
}
