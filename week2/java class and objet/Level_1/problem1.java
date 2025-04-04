class problem1 {
    String name;
    int id;
    double salary;

    public problem1(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        problem1 employee1 = new problem1("Alice", 101, 50000.00);
        problem1 employee2 = new problem1("Bob", 102, 60000.50);
        employee1.displayDetails();

        employee2.displayDetails();
    }
}