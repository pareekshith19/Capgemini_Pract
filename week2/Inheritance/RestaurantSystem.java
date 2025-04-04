// Superclass
class Person {
    protected String name;
    protected String id;
    
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Subclass Chef
class Chef extends Person implements Worker {
    private String specialty;
    
    public Chef(String name, String id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }
    
    @Override
    public void performDuties() {
        System.out.println(name + " is preparing " + specialty + " dishes.");
    }
}

// Subclass Waiter
class Waiter extends Person implements Worker {
    private int tablesAssigned;
    
    public Waiter(String name, String id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }
    
    @Override
    public void performDuties() {
        System.out.println(name + " is serving " + tablesAssigned + " tables.");
    }
}