import java.util.Scanner;

public class problem8 {
  
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      double var2 = var1.nextDouble();
      double var4 = var2 * 1.6;
      System.out.printf("The total miles is %f mile for the given %f km", var4, var2);
      var1.close();
   }
}