import java.util.*;

public class VotingSystem {

    static class VotingManager {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

        public void vote(String candidate) {
            hashMap.put(candidate, hashMap.getOrDefault(candidate, 0) + 1);
            linkedHashMap.put(candidate, linkedHashMap.getOrDefault(candidate, 0) + 1);
            treeMap.put(candidate, treeMap.getOrDefault(candidate, 0) + 1);
        }

        public void displayResults() {
            System.out.println("Voting Results in HashMap (unordered):");
            hashMap.forEach((candidate, votes) -> System.out.println(candidate + ": " + votes));

            System.out.println("\nVoting Results in LinkedHashMap (order of voting):");
            linkedHashMap.forEach((candidate, votes) -> System.out.println(candidate + ": " + votes));

            System.out.println("\nVoting Results in TreeMap (sorted by candidate):");
            treeMap.forEach((candidate, votes) -> System.out.println(candidate + ": " + votes));
        }

        public String getWinner() {
            return treeMap.entrySet()
                    .stream()
                    .max(Comparator.comparingInt(Map.Entry::getValue))
                    .map(Map.Entry::getKey)
                    .orElse(null);
        }
    }

    public static void main(String[] args) {
        VotingManager manager = new VotingManager();

        manager.vote("Alice");
        manager.vote("Bob");
        manager.vote("Alice");
        manager.vote("Charlie");
        manager.vote("Alice");
        manager.vote("Bob");

        manager.displayResults();

        System.out.println("\nWinner: " + manager.getWinner());
    }
}
