public class FullRemoteCourse extends OnlineCourse {
    private String contactEmail;
    public String getContactEmail() {
        return this.contactEmail;
    }
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    @Override
    public String toString() {
        return super.toString() +
               "Contact Email: " + this.contactEmail + "\n";
    }
}