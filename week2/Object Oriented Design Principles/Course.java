import java.util.ArrayList;

class Course {
    private String name;
    private ArrayList<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this); // Bidirectional association
    }
}

class School {
    private ArrayList<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

// Demo
public class Main {
    public static void main(String[] args) {
        School school = new School();
        Student alice = new Student("Alice");
        Course math = new Course("Calculus");

        school.addStudent(alice); // Aggregation
        alice.enrollInCourse(math); // Association
    }
}