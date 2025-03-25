import java.util.Scanner;

public class problem18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num<6||num>9){
            System.out.printf("cannot multiply");
        }
        else{
            for (int i = 1;i<=10;i++){
                System.out.printf("%d * %d = %d \n",num,i,(num*i));
            }
        }
        sc.close();
    }
    
}
