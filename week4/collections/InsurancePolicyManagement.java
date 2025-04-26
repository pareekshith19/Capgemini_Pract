import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class InsurancePolicyManagement {
    static class Policy implements Comparable<Policy> {
        String num, name, type;
        LocalDate date;
        double premium;

        Policy(String n, String nm, LocalDate d, String t, double p) {
            num = n; name = nm; date = d; type = t; premium = p;
        }

        public int compareTo(Policy o) {
            return date.compareTo(o.date);
        }

        public boolean equals(Object o) {
            return o instanceof Policy && num.equals(((Policy)o).num);
        }

        public int hashCode() {
            return num.hashCode();
        }

        public String toString() {
            return num + " | " + name + " | " + date + " | " + type + " | " + premium;
        }
    }

    static class Manager {
        Set<Policy> h = new HashSet<>(), l = new LinkedHashSet<>(), t = new TreeSet<>();

        void add(Policy p) {
            h.add(p); l.add(p); t.add(p);
        }

        Set<Policy> all() {
            return h;
        }

        Set<Policy> expiringSoon() {
            LocalDate today = LocalDate.now(), limit = today.plusDays(30);
            return t.stream().filter(p -> !p.date.isAfter(limit)).collect(Collectors.toSet());
        }

        Set<Policy> byType(String type) {
            return h.stream().filter(p -> p.type.equalsIgnoreCase(type)).collect(Collectors.toSet());
        }

        Set<Policy> duplicates(List<Policy> list) {
            Set<String> seen = new HashSet<>();
            return list.stream().filter(p -> !seen.add(p.num)).collect(Collectors.toSet());
        }

        void compare() {
            List<Policy> list = IntStream.range(0, 10000)
                    .mapToObj(i -> new Policy("PN" + i, "H" + i, LocalDate.now().plusDays(i % 365), "Auto", 1000 + i))
                    .collect(Collectors.toList());

            long hTime = time(() -> new HashSet<>(list));
            long lTime = time(() -> new LinkedHashSet<>(list));
            long tTime = time(() -> new TreeSet<>(list));

            System.out.println("HashSet Time: " + hTime + " ms");
            System.out.println("LinkedHashSet Time: " + lTime + " ms");
            System.out.println("TreeSet Time: " + tTime + " ms");
        }

        long time(Runnable r) {
            long s = System.nanoTime(); r.run(); return (System.nanoTime() - s) / 1_000_000;
        }
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.add(new Policy("P001", "Alice", LocalDate.now().plusDays(5), "Health", 1500));
        m.add(new Policy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 1200));
        m.add(new Policy("P003", "Charlie", LocalDate.now().plusDays(20), "Home", 1800));
        m.add(new Policy("P001", "Alice", LocalDate.now().plusDays(5), "Health", 1500));

        System.out.println("All Unique Policies:");
        m.all().forEach(System.out::println);

        System.out.println("\nPolicies Expiring Soon:");
        m.expiringSoon().forEach(System.out::println);

        System.out.println("\nPolicies with Coverage Type 'Auto':");
        m.byType("Auto").forEach(System.out::println);

        System.out.println("\nDuplicate Policies:");
        List<Policy> list = Arrays.asList(
                new Policy("P001", "Alice", LocalDate.now().plusDays(5), "Health", 1500),
                new Policy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 1200),
                new Policy("P001", "Alice", LocalDate.now().plusDays(5), "Health", 1500)
        );
        m.duplicates(list).forEach(System.out::println);

        System.out.println("\nPerformance Comparison:");
        m.compare();
    }
}
