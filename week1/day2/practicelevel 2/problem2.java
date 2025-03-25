import java.util.Scanner;

public class problem2 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int years = sc.nextInt();
        if(years>5){
            int bonus = (salary*5)/100;
            System.out.printf("the salary is %d",(salary+bonus));
        }
        sc.close();
    }
}
