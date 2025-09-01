package Workshop;

public class OutPatient extends Patient {
    private Doctor assignedDoctor;
    private Bill bill;

    public OutPatient(String name, int age, Doctor doctor, double charges) {
        super(name, age);
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
