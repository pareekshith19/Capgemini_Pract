class TransactionException extends Exception {
    public TransactionException(String message) {
        super(message);
    }
}

public class Problem5 {
    public static void processTransaction(int amount) throws TransactionException {
        if (amount < 0) {
            throw new TransactionException("Transaction amount cannot be negative");
        }
        System.out.println("Transaction processed: " + amount);
    }

    public static void handleTransaction(int amount) {
        try {
            processTransaction(amount);
        } catch (TransactionException e) {
            throw new TransactionException("Error processing transaction with amount " + amount + ": " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            handleTransaction(-50);
        } catch (TransactionException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
