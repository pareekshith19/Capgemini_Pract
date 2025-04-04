class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        balance = amount;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsInfo() {
        System.out.println("Savings Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class problem6 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("BA001", "Ravi Kumar", 10000);
        acc1.displayAccountInfo();
        acc1.setBalance(12000);
        System.out.println("Updated Balance: $" + acc1.getBalance());

        SavingsAccount sav1 = new SavingsAccount("SA100", "Meena Shah", 15000, 4.5);
        sav1.displaySavingsInfo();
        System.out.println("Balance: $" + sav1.getBalance());
    }
}
