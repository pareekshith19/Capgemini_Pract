class problem2 {
    String accountHolder;
    String accountNumber;
    double balance;

    public problem2(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of ₹" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of ₹" + amount + " successful.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance for account " + accountNumber + ": ₹" + balance);
    }

    public static void main(String[] args) {
        problem2 account1 = new problem2("John Doe", "1234567890", 1000.00);

        account1.displayBalance();

        account1.deposit(500.00);
        account1.displayBalance();

        account1.withdraw(200.00);
        account1.displayBalance();

        account1.withdraw(1500.00);
        account1.displayBalance();
    }
}