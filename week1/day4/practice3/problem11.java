import java.util.Random;

public class problem11 {

    public static double[][] generateEmployeeData() {
        double[][] employeeData = new double[10][2];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            employeeData[i][0] = 10000 + random.nextInt(90000); // 5-digit salary
            employeeData[i][1] = random.nextInt(10) + 1; // Years of service (1 to 10)
        }
        return employeeData;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] newSalaryAndBonus = new double[10][2];

        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonusAmount = salary * bonusPercentage;
            double newSalary = salary + bonusAmount;

            newSalaryAndBonus[i][0] = newSalary;
            newSalaryAndBonus[i][1] = bonusAmount;
        }
        return newSalaryAndBonus;
    }

    public static void displaySalaryAndBonus(double[][] oldSalaryAndService, double[][] newSalaryAndBonus) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee\tOld Salary\tYears of Service\tNew Salary\tBonus");
        for (int i = 0; i < 10; i++) {
            double oldSalary = oldSalaryAndService[i][0];
            int years = (int) oldSalaryAndService[i][1];
            double newSalary = newSalaryAndBonus[i][0];
            double bonus = newSalaryAndBonus[i][1];

            System.out.printf("Employee %d\t%.2f\t%d\t\t%.2f\t\t%.2f\n", i + 1, oldSalary, years, newSalary, bonus);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.println("\nTotal Old Salary:\t" + totalOldSalary);
        System.out.println("Total New Salary:\t" + totalNewSalary);
        System.out.println("Total Bonus Amount:\t" + totalBonus);
    }

    public static void main(String[] args) {
        double[][] oldSalaryAndService = generateEmployeeData();
        double[][] newSalaryAndBonus = calculateNewSalaryAndBonus(oldSalaryAndService);
        displaySalaryAndBonus(oldSalaryAndService, newSalaryAndBonus);
    }
}