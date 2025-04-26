import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', salary=" + salary + '}';
    }
}

public class Problem4 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 50000));
        employees.add(new Employee(2, "Bob", "IT", 60000));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            out.writeObject(employees);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            List<Employee> loadedEmployees = (List<Employee>) in.readObject();
            loadedEmployees.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
