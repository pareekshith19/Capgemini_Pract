import java.util.Scanner;

public class problem16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num<0){
            System.out.printf("the number is not a natural number");
        }
        else{
            for(int i = 1;i<=num;i++){
                if(i%2 == 0){
                    System.out.printf("%d is even number \n",i);

                }
                else{
                    System.out.printf("%d id odd number \n",i);
                }

            }
        }
        sc.close();
    }
    
}
