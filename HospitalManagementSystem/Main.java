package HospitalManagementSystem;

public class Main {
    public static void main(String[] args) {

        Doctor doc1 = new Doctor(1, "Dr. Rathi", "Cardiology");
        Doctor doc2 = new Doctor(2, "Dr. Jain", "Neurology");

        Patient patient1 = new Patient(101, "Abhay", 30);
        Patient patient2 = new Patient(102, "Abhinav", 25, true);

        patient1.assignDoctor(doc1);
        patient2.assignDoctor(doc2);

        Bill bill1 = new Bill(1001, patient1, 500.0);
        Bill bill2 = new Bill(1002, patient2, 1500.0);

        System.out.println(patient1);
        System.out.println(patient2);

        System.out.println(doc1);
        System.out.println(doc2);

        bill1.displayBill();
        bill2.displayBill();
    }
}