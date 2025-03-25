public class problem6 {
    public static void main(String[] args){
        int fee = 125000;
        int discountpercent = 10;
        int discountamount = (fee*discountpercent)/100;
        int finalfee = fee - discountamount;
        System.out.printf("The discount amount is INR %d and final discounted fee is INR %d",discountamount,finalfee);

    }
    
}
