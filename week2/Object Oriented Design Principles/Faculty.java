import java.util.ArrayList;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }
}

class University {
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    public University() {
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void closeUniversity() {
        departments.clear(); // Departments are deleted (composition)
        // Faculties persist (aggregation)
    }
}

// Demo
public class Main {
    public static void main(String[] args) {
        University uni = new University();
        Department cs = new Department("Computer Science");
        Faculty profSmith = new Faculty("Dr. Smith");

        uni.addDepartment(cs);
        uni.addFaculty(profSmith);
        uni.closeUniversity(); // Departments deleted, Faculty remains
    }
}