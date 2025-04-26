import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManagement2 {

    static class Policy {
        private String policyNumber;
        private String policyholderName;
        private LocalDate expiryDate;
        private String coverageType;
        private double premiumAmount;

        public Policy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
            this.policyNumber = policyNumber;
            this.policyholderName = policyholderName;
            this.expiryDate = expiryDate;
            this.coverageType = coverageType;
            this.premiumAmount = premiumAmount;
        }

        public String getPolicyNumber() {
            return policyNumber;
        }

        public String getPolicyholderName() {
            return policyholderName;
        }

        public LocalDate getExpiryDate() {
            return expiryDate;
        }

        public String getCoverageType() {
            return coverageType;
        }

        public double getPremiumAmount() {
            return premiumAmount;
        }

        @Override
        public String toString() {
            return "PolicyNumber: " + policyNumber + ", Policyholder: " + policyholderName + ", Expiry Date: " + expiryDate + ", Coverage: " + coverageType + ", Premium: $" + premiumAmount;
        }
    }

    static class PolicyManager {
        Map<String, Policy> hashMap = new HashMap<>();
        Map<String, Policy> linkedHashMap = new LinkedHashMap<>();
        Map<String, Policy> treeMap = new TreeMap<>(Comparator.comparing(policyNumber -> hashMap.get(policyNumber).getExpiryDate()));

        public void addPolicy(Policy policy) {
            hashMap.put(policy.getPolicyNumber(), policy);
            linkedHashMap.put(policy.getPolicyNumber(), policy);
            treeMap.put(policy.getPolicyNumber(), policy);
        }

        public Policy getPolicyByNumber(String policyNumber) {
            return hashMap.get(policyNumber);
        }

        public List<Policy> getPoliciesExpiringSoon() {
            List<Policy> expiringPolicies = new ArrayList<>();
            LocalDate today = LocalDate.now();
            LocalDate limit = today.plusDays(30);
            for (Policy policy : treeMap.values()) {
                if (!policy.getExpiryDate().isAfter(limit)) {
                    expiringPolicies.add(policy);
                }
            }
            return expiringPolicies;
        }

        public List<Policy> getPoliciesByPolicyholder(String policyholderName) {
            List<Policy> policies = new ArrayList<>();
            for (Policy policy : hashMap.values()) {
                if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                    policies.add(policy);
                }
            }
            return policies;
        }

        public void removeExpiredPolicies() {
            LocalDate today = LocalDate.now();
            hashMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
            linkedHashMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
            treeMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
        }

        public void displayAllPolicies() {
            System.out.println("Policies in HashMap (unordered):");
            hashMap.values().forEach(System.out::println);

            System.out.println("\nPolicies in LinkedHashMap (insertion order):");
            linkedHashMap.values().forEach(System.out::println);

            System.out.println("\nPolicies in TreeMap (sorted by expiry date):");
            treeMap.values().forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 1200.0));
        manager.addPolicy(new Policy("P002", "Bob", LocalDate.now().plusDays(20), "Auto", 1500.0));
        manager.addPolicy(new Policy("P003", "Alice", LocalDate.now().plusDays(5), "Home", 1000.0));
        manager.addPolicy(new Policy("P004", "Charlie", LocalDate.now().minusDays(5), "Health", 1100.0));
        manager.addPolicy(new Policy("P005", "Bob", LocalDate.now().plusDays(25), "Life", 2000.0));

        manager.displayAllPolicies();

        System.out.println("\nPolicy P002: " + manager.getPolicyByNumber("P002"));

        System.out.println("\nPolicies expiring soon:");
        manager.getPoliciesExpiringSoon().forEach(System.out::println);

        System.out.println("\nPolicies for Alice:");
        manager.getPoliciesByPolicyholder("Alice").forEach(System.out::println);

        System.out.println("\nRemoving expired policies...");
        manager.removeExpiredPolicies();

        manager.displayAllPolicies();
    }
}
