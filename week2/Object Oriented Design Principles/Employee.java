import java.util.ArrayList;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }
}

class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
}

class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    // Deleting the company deletes all departments (composition)
    public void closeCompany() {
        departments.clear(); // Departments/Employees are garbage-collected
    }
}

// Demo
public class Main {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");
        Department hr = new Department("HR");
        hr.addEmployee(new Employee("John"));

        company.addDepartment(hr);
        company.closeCompany(); // Departments/Employees are deleted
    }
}