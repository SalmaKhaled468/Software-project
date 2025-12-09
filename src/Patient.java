import java.util.ArrayList;
import java.util.List;

public class Patient extends User{
    private String medicalHistory;
    private String emergencyContact;
    private List<Appointment> appointments;
    private List<EHR> ehrs;
    private List<Prescription> prescriptions;
    private List<Bill> bills;
    private List<Feedback> feedbacks;

    public Patient(int id, String name, String email, String contact,
                   String medicalHistory, String emergencyContact) {
        super(id, name, email, contact);
        this.medicalHistory = medicalHistory;
        this.emergencyContact = emergencyContact;
    }

    public Patient(int id, String name, String email, String contact,
                   String medicalHistory, String emergencyContact,
                   List<Appointment> appointments, List<EHR> ehrs,
                   List<Prescription> prescriptions, List<Bill> bills,
                   List<Feedback> feedbacks) {
        super(id, name, email, contact);
        this.medicalHistory = medicalHistory;
        this.emergencyContact = emergencyContact;
        this.appointments = new ArrayList<Appointment>();
        this.ehrs = new  ArrayList<EHR>();
        this.prescriptions = new ArrayList<Prescription>();
        this.bills = new ArrayList<Bill>();
        this.feedbacks = new ArrayList<Feedback>();
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public List<EHR> getEhrs() {
        return ehrs;
    }

    public void setEhrs(List<EHR> ehrs) {
        this.ehrs = ehrs;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

}
