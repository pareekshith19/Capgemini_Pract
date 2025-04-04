class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public void openAccount(Customer customer) {
        System.out.println(customer.getName() + " opened an account at " + this.name);
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void viewBalance() {
        System.out.println(name + " viewed their balance.");
    }
}

// Demo
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Chase");
        Customer customer = new Customer("Alice");

        bank.openAccount(customer); // Association
        customer.viewBalance();
    }
}