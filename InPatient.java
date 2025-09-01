package Workshop;

public class InPatient extends Patient {
    private Doctor assignedDoctor;
    private Bill bill;

    public InPatient(String name, int age, String medicalHistory, Doctor doctor, double charges) {
        super(name, age, medicalHistory);
        this.assignedDoctor = doctor;
        this.bill = new Bill(charges);
    }

    public String getPatientDetails() {
        return super.getSummary() + "\n" + assignedDoctor.getDetails();
    }

    public double getBillAmount() {
        return bill.calculatePayment();
    }

    public Bill getBill() {
        return bill;
    }
}
