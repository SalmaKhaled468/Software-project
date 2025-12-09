public class Bill {
    private int id;
    private double amount;
    private String status;
    private Patient patient;
    private Appointment appointment;

    public Bill(int id, double amount, String status,
                Patient patient, Appointment appointment) {
        this.id = id;
        this.amount = amount;
        this.status = status;
        this.patient = patient;
        this.appointment = appointment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
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

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public void payBill() {}

//    @Override
//    public String toString() {}

}
