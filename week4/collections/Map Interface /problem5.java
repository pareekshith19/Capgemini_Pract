import java.util.*;

public class problem5 {

    static class Employee {
        String name;
        String department;

        Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static Map<String, List<Employee>> groupEmployeesByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> groupedEmployees = new HashMap<>();

        for (Employee employee : employees) {
            groupedEmployees.computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>()).add(employee);
        }

        return groupedEmployees;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> groupedByDepartment = groupEmployeesByDepartment(employees);

        for (Map.Entry<String, List<Employee>> entry : groupedByDepartment.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
