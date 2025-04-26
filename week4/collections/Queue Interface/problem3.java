import java.util.*;

public class problem3 {

    static void hospitalTriageSystem() {
        PriorityQueue<Patient> pq = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.severity, p1.severity));
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        System.out.println("Patient Treatment Order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll().name);
        }
    }

    static class Patient {
        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }

    public static void main(String[] args) {
        hospitalTriageSystem();
    }
}
