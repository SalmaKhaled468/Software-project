public class Prescription {
    private int id;
    private Patient patient;
    private Provider provider;
    private String medication;
    private String dosage;

    public Prescription(int id, Patient patient, Provider provider,
                        String medication, String dosage) {
        this.id = id;
        this.patient = patient;
        this.provider = provider;
        this.medication = medication;
        this.dosage = dosage;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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

    public String getMedication() {
        return medication;
    }
    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getDosage() {
        return dosage;
    }
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

//    @Override
//    public String toString() {}

}
