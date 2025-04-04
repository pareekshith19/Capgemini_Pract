class Student {
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private double grade;

    Student(String name, int rollNumber, double grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade);
        }
    }
}
