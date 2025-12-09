public class Feedback {
    private int id;
    private int rating;
    private String comments;
    private Appointment appointment;

    public Feedback(int id, int rating, String comments, Appointment appointment) {
        this.id = id;
        this.rating = rating;
        this.comments = comments;
        this.appointment = appointment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

}
