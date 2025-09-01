package Workshop;

public class Doctor {
    public String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getDetails() {
        return "Doctor: " + name + ", Specialization: " + specialization;
    }
}
