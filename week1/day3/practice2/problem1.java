import java.util.Scanner;
import java.text.DecimalFormat;

public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int numEmployees = 10;
        double[] salaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        for (int i = 0; i < numEmployees; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                if (input.hasNextDouble()) {
                    salaries[i] = input.nextDouble();
                    if (salaries[i] >= 0) {
                        System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                        if(input.hasNextDouble()){
                            yearsOfService[i] = input.nextDouble();
                            if(yearsOfService[i]>=0){
                                validInput = true;
                            }else{
                                System.out.println("Invalid input for years of service. Please enter a non-negative number.");
                                input.nextLine();
                            }

                        }else{
                            System.out.println("Invalid input for years of service. Please enter a number.");
                            input.nextLine();
                        }

                    } else {
                        System.out.println("Invalid input for salary. Please enter a non-negative number.");
                        input.nextLine();
                    }
                } else {
                    System.out.println("Invalid input for salary. Please enter a number.");
                    input.nextLine();
                }
            }
        }
        for (int i = 0; i < numEmployees; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        System.out.println("\nTotal Bonus Payout: $" + df.format(totalBonus));
        System.out.println("Total Old Salary: $" + df.format(totalOldSalary));
        System.out.println("Total New Salary: $" + df.format(totalNewSalary));
        System.out.println("\nEmployee details:");
        for(int i = 0;i<numEmployees;i++){
            System.out.println("Employee "+(i+1)+":");
            System.out.println("  Salary: $"+df.format(salaries[i]));
            System.out.println("  Years of service: "+yearsOfService[i]);
            System.out.println("  Bonus: $"+df.format(bonuses[i]));
            System.out.println("  New Salary: $"+df.format(newSalaries[i]));
            System.out.println();
        }
    }
}