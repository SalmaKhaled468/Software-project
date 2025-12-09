import java.util.List;

public class VirtualCareSystem {
    private List<User> users;
    private List<Appointment> appointments;
    private List<EHR> ehrs;
    private List<Prescription> prescriptions;
    private List<Bill> bills;
    private List<Feedback> feedbacks;

    public  List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
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

    public Patient registerPatient(Patient patient) {
        return patient;
    }

    public Provider registrationProvider(Provider provider) {
        return provider;
    }

    public List<Appointment> scheduleAppointment(Patient patient, Provider provider, String dateTime) {
        return appointments;
    }

    public void conductConsultation(Patient patient, Provider provider, Appointment appointment) {}

    public void updateEhr(EHR ehr, Appointment appointment) {}

    public void generateBill(Patient patient) {}

    public void provideFeedback(Feedback feedback) {}

}
