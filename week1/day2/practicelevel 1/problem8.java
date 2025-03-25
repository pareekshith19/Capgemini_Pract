import java.util.Scanner;

public class problem8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num >=1){
            System.out.printf("%d ",num);
            num--;
        }
        sc.close();
    }
    
}
