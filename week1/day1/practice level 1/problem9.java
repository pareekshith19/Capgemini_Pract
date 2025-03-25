import java.util.Scanner;

public class problem9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int discountpercent = sc.nextInt();
        int discountamount = (fee*discountpercent)/100;
        int finalfee = fee - discountamount;
        System.out.printf("The discount amount is INR %d and final discounted fee is INR %d",discountamount,finalfee);
        sc.close();

    }
    
}
