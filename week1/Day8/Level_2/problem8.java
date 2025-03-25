import java.util.Scanner;
public class problem8 {
    public static void main(String[] args) {
        double celsius = getInput("Enter temp in C: ");
        double fahrenheit = getInput("Enter temp in F: ");
        System.out.println(celsius + "°C = " + ctof(celsius) + "°F");
        System.out.println(fahrenheit + "°F = " + ftoc(fahrenheit) + "°C");
    }
    public static double getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }
    public static double ctof(double c) {
        return (c * 9 / 5) + 32;
    }
    public static double ftoc(double f) {
        return (f - 32) * 5 / 9;
    }
}