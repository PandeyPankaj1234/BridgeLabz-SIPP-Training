package HospitalManagementSystem;

public class Patient {
    private int id;
    private String name;
    private int age;
    private boolean emergency;
    private Doctor assignedDoctor;

    public Patient(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.emergency = false;
    }

    public Patient(int id, String name, int age, boolean emergency) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.emergency = emergency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isEmergency() {
        return emergency;
    }

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    public void assignDoctor(Doctor doctor) {
        this.assignedDoctor = doctor;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", emergency=" + emergency +
                ", assignedDoctor=" + (assignedDoctor != null ? assignedDoctor.getName() : "None") +
                '}';
    }
}