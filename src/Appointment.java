public class Appointment {
    private int id;
    private String dateTime;
    private String status;
    private Patient patient;
    private Provider provider;

    public Appointment(int id, String dateTime, String status, Patient patient, Provider provider) {
        this.id = id;
        this.dateTime = dateTime;
        this.status = status;
        this.patient = patient;
        this.provider = provider;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDateTime() {
        return dateTime;
    }
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Provider getProvider() {
        return provider;
    }
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

}
