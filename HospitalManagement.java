package Workshop;

public class HospitalManagement {
    public static void main(String[] args) {

        Doctor doc1 = new Doctor("Dr. Smith", "Cardiology");
        Doctor doc2 = new Doctor("Dr. Jones", "Neurology");

        InPatient patient1 = new InPatient("John Doe", 45, "Heart Disease", doc1, 5000);
        OutPatient patient2 = new OutPatient("Jane Roe", 30, doc2, 1500);

        patient1.getBill().addTax(10); 
        patient1.getBill().applyDiscount(5); 

        patient2.getBill().addTax(8);
        patient2.getBill().applyDiscount(2);

        System.out.println("Inpatient Details:\n" + patient1.getPatientDetails());
        System.out.println("Total Bill: $" + patient1.getBillAmount());

        System.out.println("\nOutpatient Details:\n" + patient2.getPatientDetails());
        System.out.println("Total Bill: $" + patient2.getBillAmount());
    }
}
