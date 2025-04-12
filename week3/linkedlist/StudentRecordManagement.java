class StudentRecordManagement {
    static class Student {
        int rollNumber;
        String name;
        int age;
        String grade;
        Student next;

        Student(int rollNumber, String name, int age, String grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    Student head = null;

    // Add student at the end
    void addStudentEnd(int rollNumber, String name, int age, String grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    // Add student at the beginning
    void addStudentBeginning(int rollNumber, String name, int age, String grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    // Add at specific position
    void addStudentAtPosition(int pos, int rollNumber, String name, int age, String grade) {
        if (pos == 0) {
            addStudentBeginning(rollNumber, name, age, grade);
            return;
        }
        Student newStudent = new Student(rollNumber, name, age, grade);
        Student temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    // Delete by roll number
    void deleteStudent(int rollNumber) {
        if (head == null) return;
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Search by roll number
    Student searchStudent(int rollNumber) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Update grade
    void updateGrade(int rollNumber, String newGrade) {
        Student student = searchStudent(rollNumber);
        if (student != null) {
            student.grade = newGrade;
        }
    }

    // Display all records
    void displayAll() {
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StudentRecordManagement srm = new StudentRecordManagement();
        srm.addStudentEnd(1, "Alice", 20, "A");
        srm.addStudentBeginning(2, "Bob", 21, "B");
        srm.addStudentAtPosition(1, 3, "Charlie", 22, "C");
        srm.displayAll();

        System.out.println("\nAfter Updating Grade and Deleting Student:");
        srm.updateGrade(3, "A+");
        srm.deleteStudent(2);
        srm.displayAll();
    }
}
