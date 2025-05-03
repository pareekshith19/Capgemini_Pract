package Day1;
import java.io.*;
import java.util.*;

class Student {
    private String id;
    private String name;
    private int age;
    private int marks;

    public Student(String id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Marks: " + marks;
    }
}

public class CSVToStudentObjects {
    public static void main(String[] args) {
        String filePath = "students.csv";
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                Student student = new Student(columns[0], columns[1], Integer.parseInt(columns[2]), Integer.parseInt(columns[3]));
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
