import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        scanner.close();

        LocalDate date = LocalDate.parse(inputDate);
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Modified Date: " + modifiedDate);
    }
}
