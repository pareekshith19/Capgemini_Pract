import java.util.ArrayList;

class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    private String name;
    private ArrayList<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println(name + " consulted " + patient.getName());
    }
}

class Hospital {
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital() {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
}

// Demo
public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Doctor drJohn = new Doctor("Dr. John");
        Patient alice = new Patient("Alice");

        drJohn.consult(alice); // Association + communication
    }
}