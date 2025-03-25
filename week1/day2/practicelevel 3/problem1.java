import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year < 1582) {
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year (Multiple if-else).");
                    } else {
                        System.out.println(year + " is not a Leap Year (Multiple if-else).");
                    }
                } else {
                    System.out.println(year + " is a Leap Year (Multiple if-else).");
                }
            } else {
                System.out.println(year + " is not a Leap Year (Multiple if-else).");
            }
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year (Single if).");
            } else {
                System.out.println(year + " is not a Leap Year (Single if).");
            }
        }
        input.close();
    }
    
}
