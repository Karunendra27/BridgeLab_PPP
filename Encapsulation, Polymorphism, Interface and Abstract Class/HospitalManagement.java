import java.util.*;
//interface
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}
//abstract class
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}
//subclasses
class InPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private int days;

    public InPatient(int id, String name, int age, int days) {
        super(id, name, age);
        this.days = days;
    }
    @Override

    public double calculateBill() {
        return days * 2000; 
    }
    @Override

    public void addRecord(String record) {
        records.add(record);
    }
    @Override

    public void viewRecords() {
        System.out.println("Medical Records: " + records);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private double consultationFee;

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }
    @Override

    public double calculateBill() {
        return consultationFee;
    }
    @Override

    public void addRecord(String record) {
        records.add(record);
    }
    @Override

    public void viewRecords() {
        System.out.println("Medical Records: " + records);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        InPatient p1 = new InPatient(1, "Ramesh", 40, 5);
        OutPatient p2 = new OutPatient(2, "Sita", 30, 500);

        p1.addRecord("Admitted for fever");
        p2.addRecord("Consultation for headache");

        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            ((MedicalRecord)p).viewRecords();
        }
    }
}
