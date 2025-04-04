// Base class
class Employee {
    protected String name;
    protected String id;
    protected double salary;
    
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass Manager
class Manager extends Employee {
    private int teamSize;
    
    public Manager(String name, String id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Role: Manager");
    }
}

// Subclass Developer
class Developer extends Employee {
    private String programmingLanguage;
    
    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Role: Developer");
    }
}

// Subclass Intern
class Intern extends Employee {
    private String university;
    
    public Intern(String name, String id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + university);
        System.out.println("Role: Intern");
    }
}