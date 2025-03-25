import java.util.Scanner;

public class problem3 {
        public static char calculateGrade(double marks) {
        if (marks >= 80) {
            return 'A';
        } else if (marks >= 70) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 50) {
            return 'D';
        } else if (marks >= 40) {
            return 'E';
        } else {
            return 'R';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] subjects = {"Physics", "Chemistry", "Maths"};
        double totalMarks = 0;

        for (String subject : subjects) {
            double marks;
            while (true) {
                try {
                    System.out.print("Enter marks for " + subject + ": ");
                    marks = Double.parseDouble(scanner.nextLine());
                    if (marks >= 0 && marks <= 100) {
                        totalMarks += marks;
                        break;
                    } else {
                        System.out.println("Marks must be between 0 and 100. Please try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }
        }

        double percentage = (totalMarks / (subjects.length * 100)) * 100;
        char grade = calculateGrade(percentage);

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    
}
}
