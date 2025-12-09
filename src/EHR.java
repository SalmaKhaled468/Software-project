public class EHR {
    private int id;
    private String diagnosis;
    private String treatment;
    private Patient patient;
    private Provider provider;

    public EHR(int id, String diagnosis, String treatment,
               Patient patient, Provider provider) {
        this.id = id;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.patient = patient;
        this.provider = provider;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
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
