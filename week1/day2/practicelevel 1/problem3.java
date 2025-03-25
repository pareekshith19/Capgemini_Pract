import java.util.Scanner;
public class problem3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.printf("Is the first number the largest? %b \n Is the second number the largest? %b \n Is the third number the largest? %b",(num1>num2 && num1>num3),(num2>num1 && num2>num3),(num3>num1 && num3>num2));
        sc.close();
    }
    
}
