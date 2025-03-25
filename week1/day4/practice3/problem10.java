import java.util.Scanner;

public class problem10 {

    public static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.println("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.println("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.println("Enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.println("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.println("Enter y3: ");
        double y3 = scanner.nextDouble();

        scanner.close();

        System.out.println("Using Slope Formula: " + areCollinearUsingSlope(x1, y1, x2, y2, x3, y3));
        System.out.println("Using Area Formula: " + areCollinearUsingArea(x1, y1, x2, y2, x3, y3));
    }
}