package HospitalManagementSystem;

public class Bill {
    private int billId;
    private Patient patient;
    private double amount;

    public Bill(int billId, Patient patient, double amount) {
        this.billId = billId;
        this.patient = patient;
        this.amount = amount;
    }

    public int getBillId() {
        return billId;
    }

    public Patient getPatient() {
        return patient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void displayBill() {
        System.out.println("Bill ID: " + billId);
        System.out.println("Patient: " + patient.getName());
        System.out.println("Amount: $" + amount);
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billId=" + billId +
                ", patient=" + patient.getName() +
                ", amount=" + amount +
                '}';
    }
}