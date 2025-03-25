import java.util.Scanner;

public class problem12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = 0;
        int equation = (num*(num+1))/2;
        if (num<0){
            System.out.printf("%d is not  a natura number",num);
        }
        else{
        while(num >=0 ){
           
            total = total + num;
            num = num - 1;
            
        }
        System.out.printf("the sum with while loop is %d and with formula is %d",total,equation);
    }
        sc.close();
      
    }


    
}
