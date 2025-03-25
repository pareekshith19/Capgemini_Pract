import java.util.Scanner;
public class problem4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 0){
            System.out.printf("The number %d is not a natural number",number);
        }
        else{
            System.out.printf("The sum of %d natural numbers is %d",number,((number*(number+1))/2));


        }
        sc.close();

    }
    
}
