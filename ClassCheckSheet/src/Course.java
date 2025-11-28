public class Course {
    private String courseNumber;
    private int numStudents, maxStudents;
    private double credits;
    public String getCourseNumber() {
        return this.courseNumber;
    }
    public int getNumStudents() {
        return this.numStudents;
    }
    public int getMaxStudents() {
        return this.maxStudents;
    }
    public double getCredits() {
        return this.credits;
    }
    public void setCourseNumberNumStudentsMaxStudentsCredits(
            String courseNumber, int numStudents, int maxStudents, double credits) {
        this.courseNumber = courseNumber;
        this.numStudents = numStudents;
        this.maxStudents = maxStudents;
        this.credits = credits;
    }
    @Override
    public String toString() {
        return "Course Number: " + this.courseNumber + "\n" +
               "Current Students: " + this.numStudents + "\n" +
               "Max Students: " + this.maxStudents + "\n" +
               "Credits: " + this.credits + "\n";
    }
}
