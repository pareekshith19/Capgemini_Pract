import java.util.Scanner;

public class problem7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number<=0){
            System.out.printf("the number is negative or zero number");
        }
        else{
            for (int i=1;i<=number;i++){
                if(number%i==0){
                    System.out.printf("%d is divisible by %d \n",number,i);
                }
            }
        }
        sc.close();
    }
    
}
