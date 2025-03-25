import java.util.Scanner;

public class problem10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        double heightininches = height/2.54;
        double heightinfoot = heightininches/12;
        System.out.printf("Your Height in cm is %d while in feet is %f and inches is %f",height,heightinfoot,heightininches);
        sc.close();
    }

    
}
