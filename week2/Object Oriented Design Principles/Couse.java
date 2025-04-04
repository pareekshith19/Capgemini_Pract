import java.util.ArrayList;

class Couse {
    private String name;
    private Professor professor;
    private ArrayList<Student> students;

    public Couse(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor prof) {
        this.professor = prof;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        course.enrollStudent(this);
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public void teachCourse(Course course) {
        course.assignProfessor(this);
    }
}

// Demo
public class Main {
    public static void main(String[] args) {
        Student alice = new Student("Alice");
        Professor drSmith = new Professor("Dr. Smith");
        Course cs101 = new Course("CS101");

        alice.enrollCouse(cs101); // Student-Course association
        drSmith.teachCouse(cs101); // Professor-Course association
    }
}