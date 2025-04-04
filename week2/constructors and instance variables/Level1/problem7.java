class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    String level;

    Manager(int employeeID, String department, double salary, String level) {
        super(employeeID, department, salary);
        this.level = level;
    }

    public void displayManagerInfo() {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Level: " + level);
    }
}

public class problem7 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "HR", 50000);
        e1.displayEmployeeInfo();
        e1.setSalary(55000);
        System.out.println("Updated Salary: $" + e1.getSalary());

        Manager m1 = new Manager(201, "IT", 80000, "Senior");
        m1.displayManagerInfo();
        System.out.println("Salary: $" + m1.getSalary());
    }
}
