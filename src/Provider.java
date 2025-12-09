import java.util.ArrayList;
import java.util.List;

public class Provider extends User{
    private String specialty;
    private String availability;
    private List<Appointment> appointments;
    private List<Patient> patients;

    public Provider(int id, String name, String email, String contact,
                    String specialty, String availability) {
        super(id, name, email, contact);
        this.specialty = specialty;
        this.availability = availability;
    }

    public Provider(int id, String name, String email, String contact,
                    String specialty, String availability,
                    List<Appointment> appointments, List<Patient> patients) {
        super(id,name,email,contact);
        this.specialty = specialty;
        this.availability = availability;
        this.appointments = new ArrayList<Appointment>();
        this.patients = new ArrayList<Patient>();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public void manageSchedule() {}
}
