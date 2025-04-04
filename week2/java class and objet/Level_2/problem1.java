class problem1 {
    String name;
    int rollNumber;
    double marks;

    public problem1(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public void displayDetailsWithGrade() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        problem1 student1 = new problem1("Alice", 101, 85.5);
        problem1 student2 = new problem1("Bob", 102, 92.0);
        problem1 student3 = new problem1("Charlie", 103, 55.0);

        student1.displayDetailsWithGrade();

        student2.displayDetailsWithGrade();

        student3.displayDetailsWithGrade();
    }
}