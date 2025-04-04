abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;
    private String records = "";

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        records += record + "\n";
    }

    @Override
    public String viewRecords() {
        return records;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String records = "";

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records += record + "\n";
    }

    @Override
    public String viewRecords() {
        return records;
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient p1 = new InPatient("P001", "Alice", 30, 5, 2000);
        Patient p2 = new OutPatient("P002", "Bob", 45, 500);

        System.out.println(p1.getPatientDetails());
        System.out.println("Bill: ₹" + p1.calculateBill());

        System.out.println(p2.getPatientDetails());
        System.out.println("Bill: ₹" + p2.calculateBill());

        MedicalRecord r1 = (MedicalRecord) p1;
        r1.addRecord("Admitted for fever and observation.");
        System.out.println("InPatient Records:\n" + r1.viewRecords());

        MedicalRecord r2 = (MedicalRecord) p2;
        r2.addRecord("Consulted for back pain.");
        System.out.println("OutPatient Records:\n" + r2.viewRecords());
    }
}