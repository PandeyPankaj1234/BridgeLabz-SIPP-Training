package Workshop;

public abstract class Patient {
    private String PatientName;
    private String medicalHistory;
    private int PatientAge;
    private String admissionType; 

    public Patient(String PatientName, int PatientAge, String medicalHistory) {
        this.PatientName = PatientName;
        this.PatientAge = PatientAge;
        this.medicalHistory = medicalHistory;
        this.admissionType = "Normal";
    }

    public Patient(String PatientName, int PatientAge) {
        this.PatientName = PatientName;
        this.PatientAge = PatientAge;
        this.medicalHistory = "N/A";
        this.admissionType = "Emergency";
    }

    public String getSummary() {
        return "Name: " + PatientName + "\n" +
                "Age: " + PatientAge + "\n" +
                "Admission Type: " + admissionType;
    }

    protected String getMedicalHistory() {
        return medicalHistory;
    }
}
