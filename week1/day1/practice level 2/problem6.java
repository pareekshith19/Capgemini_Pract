import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter bonus: ");
        double bonus = scanner.nextDouble();

        double totalIncome = salary + bonus;

        System.out.printf("The salary is INR %.2f and bonus is INR %.2f. Hence, Total Income is INR %.2f%n",
                salary, bonus, totalIncome);

        scanner.close();
    }
    
}
