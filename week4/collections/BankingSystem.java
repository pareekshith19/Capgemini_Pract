import java.util.*;

public class BankingSystem {

    static class BankingManager {
        Map<String, Double> hashMap = new HashMap<>();
        Map<String, Double> treeMap = new TreeMap<>(Comparator.comparing(hashMap::get));
        Queue<String> withdrawalQueue = new LinkedList<>();

        public void addAccount(String accountNumber, double balance) {
            hashMap.put(accountNumber, balance);
            treeMap.put(accountNumber, balance);
        }

        public void processWithdrawal(String accountNumber, double amount) {
            withdrawalQueue.add(accountNumber);
            if (hashMap.containsKey(accountNumber) && hashMap.get(accountNumber) >= amount) {
                double newBalance = hashMap.get(accountNumber) - amount;
                hashMap.put(accountNumber, newBalance);
                treeMap.put(accountNumber, newBalance);
                System.out.println("Processed withdrawal of $" + amount + " for account " + accountNumber);
            } else {
                System.out.println("Insufficient funds or account does not exist for " + accountNumber);
            }
        }

        public void displayAccounts() {
            System.out.println("Customers sorted by balance (TreeMap):");
            treeMap.forEach((account, balance) -> System.out.println(account + ": $" + balance));
        }

        public void processRequests() {
            while (!withdrawalQueue.isEmpty()) {
                String accountNumber = withdrawalQueue.poll();
                System.out.println("Processing withdrawal request for account: " + accountNumber);
            }
        }
    }

    public static void main(String[] args) {
        BankingManager manager = new BankingManager();

        manager.addAccount("A001", 5000.00);
        manager.addAccount("A002", 3000.00);
        manager.addAccount("A003", 10000.00);

        manager.processWithdrawal("A002", 500.00);
        manager.processWithdrawal("A003", 2000.00);
        manager.processWithdrawal("A004", 100.00);

        manager.displayAccounts();
        manager.processRequests();
    }
}
